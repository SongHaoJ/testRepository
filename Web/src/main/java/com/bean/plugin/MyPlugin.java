package com.bean.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.Iterator;
import java.util.List;

public class MyPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {

        return true;
    }

    @Override
    public boolean sqlMapDocumentGenerated(Document document,
                                           IntrospectedTable introspectedTable) {
        XmlElement rootElement = document.getRootElement();
        /*<sql id="TableName">
            DB_ORDER
          </sql>*/
        XmlElement tableName = new XmlElement("sql");
        tableName.addAttribute(new Attribute("id","TableName"));
        tableName.addElement(new TextElement(introspectedTable.getFullyQualifiedTableNameAtRuntime()));
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
        XmlElement colums = new XmlElement("sql");
        XmlElement values = new XmlElement("sql");
        criteria.addAttribute(new Attribute("id", "Criteria"));
        colums.addAttribute(new Attribute("id","Colums"));
        values.addAttribute(new Attribute("id","Values"));

        Iterator<IntrospectedColumn> iter = introspectedTable.getAllColumns().iterator();


        while (iter.hasNext()) {
            IntrospectedColumn column = iter.next();

            XmlElement cri = new XmlElement("if");
            XmlElement cri2 = new XmlElement("if");
            XmlElement cri3 = new XmlElement("if");
            String str = column.getActualColumnName().toLowerCase() + " != null";
            cri.addAttribute(new Attribute("test", str));
            cri2.addAttribute(new Attribute("test", str));
            cri3.addAttribute(new Attribute("test", str));

            String str2 = column.getActualColumnName().toUpperCase() + " = #{" + column.getActualColumnName().toLowerCase() + ",jdbcType=" + column.getJdbcTypeName() + "}";
            String str3 = column.getActualColumnName().toUpperCase();
            String str4 = " #{" + column.getActualColumnName().toLowerCase() + ",jdbcType=" + column.getJdbcTypeName() + "}";

            if (iter.hasNext()) {
                str2 += " and ";
                str3 += " , ";
                str4 += " , ";
            }
            cri.addElement(new TextElement(str2));
            criteria.addElement(cri);
            cri2.addElement(new TextElement(str3));
            colums.addElement(cri2);
            cri3.addElement(new TextElement(str4));
            values.addElement(cri3);
        }

        rootElement.addElement(colums);
        rootElement.addElement(values);
        rootElement.addElement(criteria);

        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }
}