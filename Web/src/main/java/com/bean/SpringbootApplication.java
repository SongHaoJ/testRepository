package com.bean;


import com.bean.DataSource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;


@MapperScan("com.bean.dao")
@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
public class SpringbootApplication extends SpringBootServletInitializer {
    public static final Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootApplication.class);
    }

    public static void main(String args[]) {
        logger.debug("SpringBootWeb开始启动");
        SpringApplication.run(SpringbootApplication.class, args);
        tableName();
    }


    public static void tableName() {

        /*
         <table tableName="db_sell" domainObjectName="DbSell" enableCountByExample="false" enableUpdateByExample="false"
               enableDeleteByExample="false" enableSelectByExample="false" selectByExampleQueryId="false" />
         */
        String str = "db_addaction,db_addfunction,db_aliaddress,db_alibb,db_alibbporder,db_aliexpresstype,db_alifeedbackorder,db_alinewproduct,db_aliorderinfo,db_alisku,db_alisupplier,db_allocate_temp,db_amazonexpresstype,db_amazonorder,db_amazonsell,db_analysetype,db_antistop,db_antistoprele,db_antistopshop,db_area,db_area1,db_askrussianmobile,db_asktradernumber,db_autoaddsalenum,db_autoaddsalenumlog,db_aycountry,db_aywarehouse,db_back_money,db_backnote,db_banproduct,db_beiubuser,db_biaoju,db_biaojuexpresstype,db_biaojuextend,db_biaojuuser,db_bindlist,db_bindproduct,db_birdcountry,db_birdexpresstype,db_birdproduct,db_birdseller,db_boxcuser,db_bpostcountry,db_bpostexpresstype,db_bpostseller,db_brand,db_brandlog,db_bullet,db_bullettype,db_caiwu,db_caiwudeploy,db_caiwulog,db_cal_among,db_calculatconfig,db_calculate_temp,db_calculate_temp1,db_calculateall,db_calculateitem,db_calcupaypaltype,db_calcupaypaltypelog,db_calcuplatform,db_calcuplatformlog,db_calcuproducttype,db_calcuproducttypelog,db_calprice,db_category,db_categorylog,db_checkpaypaladdress,db_checkpurchasesmsprompt,db_checkstocklog,db_childsku,db_chinaexpress,db_chinaexpressarea,db_chinaexpresslog,db_ckycountry,db_ckyexpresstype,db_ckyorder,db_ckyskuconfig,db_ckytype,db_ckyuser,db_class,db_clobtest,db_cneexpresstype,db_cneseller,db_coeexpresstype,db_company,db_companyconfig,db_companylog,db_companytype,db_competitionsku,db_competitor,db_competitorlist,db_competitorsearch,db_config,db_configpicture,db_country,db_createtable,db_customer,db_customertype,db_customlable,db_default_menufunc,db_deletemessagelog,db_departmentapi,db_dept,db_descraption,db_description,db_developeraccount,db_developstatus,db_dhlcountry,db_dhllanguagecode,db_dhluser,db_downeubseller,db_downloadcount,db_ebay_expresspublished,db_ebayapi,db_ebayapilog,db_ebaybbe,db_ebaydsr,db_ebayexpresstype,db_ebayforexpress,db_ebayhighbbe,db_ebayidmanage,db_ebayidmanagehtmlsource,db_ebayinquiry,db_ebaylimit,db_ebaymessage,db_ebaymessage_temp,db_ebaymessagebind,db_ebaymessageconfig,db_ebaymessageconfiglog,db_ebaymessagecontent,db_ebaymessagedescr,db_ebaymessagedescr_temp,db_ebaymessagelog,db_ebaymessageorderconfig,db_ebaymessageorderconfiglog,db_ebaymessagetype,db_ebaymessagetypelog,db_ebayorderinfo,db_ebaysite,db_ebaytoken,db_ebaytotalsales,db_edisaddress,db_edisexpresstype,db_edispreference,db_encode,db_endicialabeltype,db_endiciamailclass,db_endiciamailpieceshape,db_endiciauser,db_endproduct,db_endproduct_online,db_endproduct_onlinelog,db_enmity,db_eubcity,db_eubdistrict,db_eubprovince,db_expense,db_expenselog,db_expensetype,db_expensetypelog,db_expressapi,db_expressapick,db_expressapiuser,db_expressblack,db_expressconfig,db_expresscountry,db_expressiddata,db_expressiddatalog,db_expresstype,db_expresstypeapi,db_expresstypelog,db_expresstyperule,db_expstore,db_expstoreitem,db_exptable,db_failtaskitem,db_faqquestion,db_feedback,db_finding,db_findingtask,db_forumanswer,db_forumlist,db_forumtopic,db_fpxconfig,db_fpxcountry,db_fpxexpresstype,db_fpxoriginarea,db_fpxprintlabel,db_functionconfig,db_functionconfiglog,db_functionlog,db_general_temp,db_gift,db_grouptype,db_huahanexpresstype,db_huahanseller,db_imgconfig,db_imgconfiglog,db_individualexpressiddata,db_instocklog,db_item_history,db_itemadd,db_itemadded,db_itemidspc,db_itemresult,db_itemresult_history,db_itemresult_temp,db_itemscontent,db_itemspe,db_itemspecifics,db_itemspecifics_temp,db_itemspecificsvalue,db_itemspecificsvalue_temp,db_itemspevalue,db_kdexpresstype,db_kdexpresstypeandcountry,db_lable,db_lablelog,db_lazadaexpresstype,db_lazadaorderinfo,db_lcl,db_lcllog,db_location,db_locationlog,db_loginfree,db_mailcontent,db_manufacture,db_manufacturelog,db_manystoragebin,db_manystoragebinlog,db_matecategory,db_menufunc,db_menufunc_bak,db_menufunc_bak2,db_mgtorderinfo,db_moban,db_mobanlog,db_modifylocation_temp,db_moneyrate,db_moneyratelog,db_muliproduct,db_multi_warehouse,db_mxprinttype,db_mymabang,db_mysql,db_mytool,db_newitemresult,db_notonlineproduct,db_onlinebanproduct,db_onlineproduct,db_onlineproductall,db_opermenu,db_opermenu_bak,db_opermenu_tmp,db_order_express,db_order_history,db_order_history_log,db_order_temp,db_order_temp1,db_orderlable_transform,db_orderlog,db_ordermessagelog,db_ordersearch,db_ordertype,db_ordertypelog,db_outbound,db_outcategoryorder,db_outcategorysell,db_packaging,db_packaginglog,db_paymentmethod,db_paymentmethod_temp,db_paymentset,db_paypal,db_paypal_temp,db_paypalconfig,db_performance,db_perstaprivilege,db_pfccountry,db_pictureattribute,db_pictureproject,db_picurl,db_picurl_temp,db_platform,db_platformlog,db_postdetail,db_postitem,db_postitem_temp,db_postitemlog,db_postmessage,db_pricelist,db_printeub,db_printeub_temp,db_printorderbyskuconfig,db_printorderbyskuconfiginfo,db_produce_new,db_product,db_product_avg,db_product_daily,db_product_history,db_product_history2,db_product_online,db_product_online_temp,db_product_temp,db_product_title,db_product_titlelog,db_productalert,db_productanditemid,db_productandmanufacture,db_productandsell,db_productbackinfo,db_productclass,db_productcontent,db_productdevelop,db_productdevelopforson,db_productdevelopgroupid,db_productdevelopnew,db_productdevelopnewlog,db_productebayfee,db_productfordescr,db_productforsell,db_productfortemplet,db_productfortitle,db_productinfo,db_productlog,db_productsearch,db_producttypeset,db_productwyt,db_project,db_projectbbs,db_projectcollaborative,db_projectdesrc,db_projectlog,db_projectproduct,db_projectsku,db_property,db_protocol,db_protocol_log,db_publishpicture,db_purchase,db_purchase_temp,db_purchasedevelop,db_purchaseflow,db_purchaseflow_log,db_purchaseflowdevelop,db_purchaseflowdevelop_log,db_purchasehand,db_purchaselog,db_purchasepayment,db_purchasepaymentdetail,db_purchasepaymentlog,db_purchasequestion,db_purchasetoallot,db_qtcountry,db_qtsku,db_qtuser,db_qtwarehouses,db_qtwmsservicetype,db_queryrobot,db_reason,db_refundpaypal,db_refundpaypallog,db_relistitem,db_repeatproduct,db_resultdetail,db_resultlist,db_return_instorage,db_returnmanagerment,db_returnmanagerment_log,db_returnreason,db_salescoefficient,db_salescoefficientlog,db_salesdata,db_savenum,db_savenummonth,db_savenumtask,db_savenumtasklog,db_scanorder,db_sell,db_sell_history,db_sell_result,db_sell_temp1,db_sellforshop,db_sellshopdescr,db_sellshopfordescr,db_sellskuforshop,db_selltostat,db_sendlist,db_sendmessage,db_sfccounty,db_sfcexpresstype,db_sfcuser,db_shiplocation,db_shippinglocation,db_shippingservice,db_shiptolocation,db_shop,db_shopebaysummary,db_shopifyproduct,db_shopingtask,db_shopmessagehistory,db_shopmessagereportforms,db_shoppingitem,db_shoppingitemdevelop,db_shoppingitemlist,db_shoppingpics,db_smsprompt,db_smspromptlog,db_smsprompttype,db_smsprompttypelog,db_smtaddress,db_smtblackname,db_smtexpressol,db_smtmessage,db_smtmessagelog,db_smtneworder,db_spaypal,db_spaypallog,db_spbase,db_specialservicecode,db_status,db_statusconfig,db_storage,db_storagelog,db_sysadmin,db_syslog,db_task,db_taskcatalog,db_taskcategory,db_taskcustomertype,db_taskcustomertypelog,db_taskitemid,db_taskkeyword,db_tasklog,db_taskshop,db_taskstatus,db_taskstatusconfig,db_taskstatuslog,db_tasktype,db_tasktypelog,db_tempsavenum,db_test,db_testexpress,db_testpaypal,db_tokenconfig,db_tradefree,db_twodevelopmentlist,db_twodevelopmentproduct,db_twodevelopmentproductlog,db_ubicountry,db_ubiseller,db_unionlog,db_unitepurchase,db_updatedescripation,db_uploadfile,db_usershowconfig,db_uspsseller,db_wishexpresstype,db_workmodle,db_workreport,db_workreportlog,db_wytcategorydetail,db_wytexpress,db_wytinsurancetype,db_wytproduct,db_wytuser,db_ydfcountry,db_ywcountry,db_ywerrorreason,db_ywexpresstype,db_ywuser,db_zhyexpress,stat_country_daily,stat_hotproduct,stat_hotshop_daily,stat_money_daily,stat_product_daily,stat_product_shop_daily,stat_productdetil_daily,stat_shop_daily,task";
        String[] strs = str.split(",");
        String result = "";
        if (strs != null && strs.length > 0) {
            for (int i = 0; i < strs.length; i++) {
                String stro = strs[i];
                String name = upperCase(stro);
                if (stro.indexOf("_") >= 0) {
                    String[] strs2 = stro.split("_");

                    if (strs2 != null && strs2.length > 0) {
                        name = "";
                        for (int n = 0; n < strs2.length; n++) {
                            String str1 = upperCase(strs2[n]);
                            name += str1;
                        }
                    }
                }

                result += "<table tableName=\""+stro+"\" domainObjectName=\""+name+"\" enableCountByExample=\"false\" enableUpdateByExample=\"false\"\n" +
                        "enableDeleteByExample=\"false\" enableSelectByExample=\"false\" selectByExampleQueryId=\"false\" />\n";

            }
        }

        logger.info(result);

    }

    public static String upperCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }


}
