/**
 * Copyright 2006-2017 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bean.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.Iterator;
import java.util.List;

/**
 * 修改dao接口，增加方法（对应mapper.xml）
 */
public class DaoPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;

    }

    //监听select方法，执行时插入新方法

    /**
     * @param method            监听的方法对象（可以直接copy）
     * @param interfaze         对应的接口对象（最后生成的dao文件）
     * @param introspectedTable 应该是获取数据库表的信息
     * @return
     */
    @Override
    public boolean clientSelectByPrimaryKeyMethodGenerated(Method method,
                                                           Interface interfaze, IntrospectedTable introspectedTable) {
        //要求xml中配置的类型是mybatis3
        if (introspectedTable.getTargetRuntime() == IntrospectedTable.TargetRuntime.MYBATIS3) {
            AddMethod(interfaze, introspectedTable);
        }
        FullyQualifiedJavaType.getIntInstance().getPrimitiveTypeWrapper();
        return true;
    }

    //重写生成xml的方法
    @Override
    public boolean sqlMapDocumentGenerated(Document document,
                                           IntrospectedTable introspectedTable) {
        try {
            //获取根节点
            XmlElement rootElement = document.getRootElement();

            //sql块

        /*<sql id="TableName">
            DB_ORDER
          </sql>*/
            //创建新节点
            XmlElement tableName = new XmlElement("sql");
            tableName.addAttribute(new Attribute("id", "TableName"));
            tableName.addElement(new TextElement(introspectedTable.getFullyQualifiedTableNameAtRuntime()));
            //添加到根节点
            rootElement.addElement(tableName);

         /* <sql id="Colums">
        <if test="corpid != null">
             CORPID ,
        </if>
        .....
        </sql>
        */
             /* <sql id="Values">
        <if test="corpid != null">
             #{corpid,jdbcType=VARCHAR} ,
        </if>
        .....
        </sql>
        */
        /* <sql id="Criteria">
        <if test="corpid != null">
            CORPID = #{corpid,jdbcType=VARCHAR} and
        </if>
        .....
        </sql>
        */
            XmlElement criteria = new XmlElement("sql");
            XmlElement updateCriteria = new XmlElement("sql");
            XmlElement columns = new XmlElement("sql");
            XmlElement values = new XmlElement("sql");
            criteria.addAttribute(new Attribute("id", "Criteria"));
            values.addAttribute(new Attribute("id", "Values"));
            updateCriteria.addAttribute(new Attribute("id", "UpdateCriteria"));
            columns.addAttribute(new Attribute("id", "Columns"));
            //获取对应表全部字段，迭代
            Iterator<IntrospectedColumn> iter = introspectedTable.getAllColumns().iterator();
            int i = 0;
            IntrospectedColumn first = null;
            while (iter.hasNext()) {
                IntrospectedColumn column = iter.next();
                String javaName = column.getActualColumnName().toLowerCase();
                if("package".equals(javaName)){
                    javaName = "dbPackage";
                }
                if("class".equals(javaName)){
                    javaName = "dbClass";
                }
                if (first == null) {
                    first = column;
                }
                String str = javaName + " != null";

                XmlElement xmlCriteria = new XmlElement("if");
                XmlElement xmlUpdateCri = new XmlElement("if");

                xmlCriteria.addAttribute(new Attribute("test", str));
                xmlUpdateCri.addAttribute(new Attribute("test", str));

                String strCriteria = column.getActualColumnName().toLowerCase() + " = #{" + javaName + ",jdbcType=" + column.getJdbcTypeName() + "}";
                String strUpdateCri = column.getActualColumnName().toLowerCase() + " = #{" + javaName + ",jdbcType=" + column.getJdbcTypeName() + "}";
                String strValues = " #{" + javaName + ",jdbcType=" + column.getJdbcTypeName() + "}";
                String strColumns = column.getActualColumnName().toUpperCase();

                strCriteria += " and ";
                strUpdateCri += " , ";
                strValues += " , ";
                strColumns += " , ";


                xmlCriteria.addElement(new TextElement(strCriteria));
                criteria.addElement(xmlCriteria);
                xmlUpdateCri.addElement(new TextElement(strUpdateCri));
                updateCriteria.addElement(xmlUpdateCri);
                values.addElement(new TextElement(strValues));
                columns.addElement(new TextElement(strColumns));
            }
            //<where></where>之前有没去除最后的and的情况，加这个保险点
            criteria.addElement(new TextElement(" 1=1"));
            updateCriteria.addElement(new TextElement(" 1=1"));

            FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType(
                    //应该是表生成的对应的model路径
                    introspectedTable.getBaseRecordType());
            if (introspectedTable.getPrimaryKeyColumns().size() == 0) {
                System.out.println("主键丢失：" + introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime());
                System.out.println("first:" + first.getActualColumnName());
            }
            FullyQualifiedJavaType priName = new FullyQualifiedJavaType(
                    introspectedTable.getPrimaryKeyColumns().size() == 0 ? first.getActualColumnName() : introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName()
            );
            FullyQualifiedJavaType priType = introspectedTable.getPrimaryKeyColumns().size() == 0 ? first.getFullyQualifiedJavaType() : introspectedTable.getPrimaryKeyColumns().get(0).getFullyQualifiedJavaType();

            //语句

            //selectByCriteria
            XmlElement selectByCriteria = new XmlElement("select");
            selectByCriteria.addAttribute(new Attribute("id", "selectByCriteria"));
            selectByCriteria.addAttribute(new Attribute("parameterType", fqjt.toString()));
            selectByCriteria.addAttribute(new Attribute("resultMap", "ResultMapWithBLOBs"));
            String str = "select <include refid=\"Columns\"/> from <include refid=\"TableName\"/> where <include refid=\"Criteria\"/> ";
            selectByCriteria.addElement(new TextElement(str));
            //deleteByPrimaryKey
            XmlElement deleteByPrimaryKey = new XmlElement("delete");
            deleteByPrimaryKey.addAttribute(new Attribute("id", "deleteByPrimaryKey"));
            deleteByPrimaryKey.addAttribute(new Attribute("parameterType", priType.getShortName()));
            String str2 = "delete from <include refid=\"TableName\"/> where " + priName.getShortName() + "=#{" + priName.getShortName() + "}";
            deleteByPrimaryKey.addElement(new TextElement(str2));
            //deleteByCriteria
            XmlElement deleteByCriteria = new XmlElement("delete");
            deleteByCriteria.addAttribute(new Attribute("id", "deleteByCriteria"));
            deleteByCriteria.addAttribute(new Attribute("parameterType", fqjt.toString()));
            String str3 = "delete from <include refid=\"TableName\"/> where <include refid=\"Criteria\"/>";
            deleteByCriteria.addElement(new TextElement(str3));
            //insertByCriteria
            XmlElement insertByCriteria = new XmlElement("insert");
            insertByCriteria.addAttribute(new Attribute("id", "insertByCriteria"));
            insertByCriteria.addAttribute(new Attribute("parameterType", fqjt.toString()));
            String str4 = "insert into <include refid=\"TableName\"/>(<include refid=\"Columns\"/>) values(<include refid=\"Values\"/>)";
            insertByCriteria.addElement(new TextElement(str4));
            //updateByCriteria
            XmlElement updateByCriteria = new XmlElement("update");
            updateByCriteria.addAttribute(new Attribute("id", "updateByCriteria"));
            updateByCriteria.addAttribute(new Attribute("parameterType", fqjt.toString()));
            String str5 = "update <include refid=\"TableName\"/> set <include refid=\"UpdateCriteria\"/> where <include refid=\"Criteria\"/>";
            updateByCriteria.addElement(new TextElement(str5));
            //添加到根节点
            rootElement.addElement(values);
            rootElement.addElement(columns);
            rootElement.addElement(criteria);
            rootElement.addElement(updateCriteria);
            rootElement.addElement(selectByCriteria);
            rootElement.addElement(deleteByPrimaryKey);
            rootElement.addElement(deleteByCriteria);
            rootElement.addElement(insertByCriteria);
            rootElement.addElement(updateByCriteria);
            return super.sqlMapDocumentGenerated(document, introspectedTable);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    /**
     * 添加新方法（）
     * Use the method copy constructor to create a new method, then
     * <p>
     * add the rowBounds parameter.
     */
    private void AddMethod(Interface interfaze, IntrospectedTable introspectedTable) {
        //应该是创建对应的java类信息
        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType(
                //应该是表生成的对应的model路径
                introspectedTable.getBaseRecordType());
        FullyQualifiedJavaType ft = new FullyQualifiedJavaType("org.springframework.stereotype.Service");

        //插入主键查询
        //创建新方法（传参一个方法就是copy）
        Method selectMethod = new Method();
        //设置方法名和参数（接口没有修饰符和方法体）
        selectMethod.setName("selectByCriteria");
        selectMethod.addParameter(new Parameter(fqjt, fqjt.getShortName()));
        //设置返回值类型（可不设置，默认void）
        selectMethod.setReturnType(fqjt);

        //插入主键删除
        Method deleteByPri = new Method();
        deleteByPri.setName("deleteByPrimaryKey");
        deleteByPri.addParameter(new Parameter(FullyQualifiedJavaType.getStringInstance(), introspectedTable.getPrimaryKeyColumns().size() == 0 ? introspectedTable.getAllColumns().get(0).getActualColumnName() : introspectedTable.getPrimaryKeyColumns().get(0).getActualColumnName()));
        //插入条件删除
        Method deleteByCriteria = new Method();
        deleteByCriteria.setName("deleteByCriteria");
        deleteByCriteria.addParameter(new Parameter(fqjt, fqjt.getShortName()));
        //插入条件插入
        Method insertByCriteria = new Method();
        insertByCriteria.setName("insertByCriteria");
        insertByCriteria.addParameter(new Parameter(fqjt, fqjt.getShortName()));
        insertByCriteria.setReturnType(FullyQualifiedJavaType.getIntInstance());
        //插入条件更新
        Method updateByCriteria = new Method();
        updateByCriteria.setName("updateByCriteria");
        updateByCriteria.addParameter(new Parameter(fqjt, fqjt.getShortName()));
        updateByCriteria.setReturnType(FullyQualifiedJavaType.getIntInstance());

        //把方法添加到接口
        interfaze.addMethod(selectMethod);
        interfaze.addMethod(deleteByPri);
        interfaze.addMethod(deleteByCriteria);
        interfaze.addMethod(insertByCriteria);
        interfaze.addMethod(updateByCriteria);
        //添加@Service注解
        interfaze.addAnnotation("@Service");
        //增加对应的import包
        interfaze.addImportedType(ft);
        interfaze.addImportedType(fqjt);
    }

}
