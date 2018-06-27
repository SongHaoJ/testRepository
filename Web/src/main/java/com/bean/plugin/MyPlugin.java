package com.bean.plugin;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;

import java.util.Iterator;
import java.util.List;

public class MyPlugin extends PluginAdapter{

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean sqlMapDocumentGenerated(Document document,
                                           IntrospectedTable introspectedTable) {
        XmlElement rootElement = document.getRootElement();
        XmlElement answer = new XmlElement("sql");
        answer.addAttribute(new Attribute("id","Criteria"));

        StringBuffer sb = new StringBuffer();
        Iterator<IntrospectedColumn> iter = introspectedTable.getAllColumns().iterator();

        /* <sql id="Criteria">
        <if test="corpid != null">
            CORPID = #{corpid,jdbcType=VARCHAR} and
        </if>*/
        while(iter.hasNext()){
            XmlElement cri = new XmlElement("if");
            cri.addAttribute(new Attribute("test","test"));
            sb.append("< if text = \"");
            IntrospectedColumn column = iter.next();

            sb.append(column.getActualColumnName());
            sb.append(" !=null \"> &#x000A;");
            sb.append(column.getActualColumnName().toUpperCase()+" = #{"+column.getActualColumnName()+",jdbcType="+column.getJdbcTypeName()+"}");

            if(iter.hasNext()){
                sb.append(" and ");
            }
            sb.append("</if> &#x000A;");
        }
        makeXmlElement(answer,sb);

        sb.append("from ");
        makeXmlElement(answer,sb);

        sb.append("  ");
        sb.append(" "+introspectedTable.getFullyQualifiedTableNameAtRuntime());
        makeXmlElement(answer,sb);

        sb.append("order by ");
        iter = introspectedTable.getPrimaryKeyColumns().iterator();
        while(iter.hasNext()){
            sb.append(" "+MyBatis3FormattingUtilities.getSelectListPhrase(iter.next()));
            if(iter.hasNext()){
                sb.append(" ,");
            }
        }
        makeXmlElement(answer,sb);

        sb.append("limit ").append("10 * (#{page,jdbcType=INTEGER}-1)").
                append(" , ").append("10 * #{page,jdbcType=INTEGER}");

        makeXmlElement(answer,sb);

        rootElement.addElement(answer);
        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    private void  makeXmlElement(XmlElement answer,StringBuffer sb){
        if(sb.length()>0){
            answer.addElement(new TextElement(sb.toString()));
            sb.setLength(0);
        }
    }
}