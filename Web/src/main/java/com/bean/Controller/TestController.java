package com.bean.Controller;

import com.bean.dao.DbOrderMapper;
import com.gourpBean.BaseOrderIncludeSellBean;
import com.service.LazadaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    public static final Logger log = LoggerFactory.getLogger(TestController.class);
    @Autowired
    DbOrderMapper orderMapper;



    @ResponseBody
    @GetMapping("/test")
    public void useController(String orderid) {
        log.info("///////");
        try {
            BaseOrderIncludeSellBean bois = orderMapper.orderAndSell(orderid);
            if(bois==null){
                log.info("空");
            }else{
                log.info("信息："+bois.toString());
            }
        } catch (Exception e) {
            log.error("异常："+e.getMessage());
        }
    }

 /*   @Autowired
    TestService service;*/
    /*@ResponseBody
    @GetMapping("/")
    public String useController(int n1){
        log.info("///////");
        if(n1 == 1)
            return service.t1();
        if(n1 == 2)
            return service.t2();
        if(n1 == 3)
            return service.t3();
        return "error";
    }

    @GetMapping("/index")
    public String index(){

        return "index";
    }

    @PostMapping("/login")
    @ResponseBody
    public Integer login(HttpServletRequest request){
        log.info("/login");
        log.info(request.getParameter("username"));
        return 0;
    }

    @GetMapping("/app/net_file/data_list.jhtml")
    @ResponseBody
    public Map<String,Object> List(){
        Map<String, Object> result = new HashMap<String, Object>();
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id", 22l);map.put("createDate", new Date());map.put("isDirectory", true);
        map.put("fileName", "文件名称");map.put("filePath", "存储路径");map.put("formatSize", 3653354l);
        map.put("fileType", "23");map.put("childrenSize", 37323l);map.put("isSharing", false);
        list.add(map);
        result.put("content", list);
        result.put("lastNetFileId", null);
        List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();
        Map<String,Object> map2 = new HashMap<String, Object>();
        map2.put("id", 33l);map2.put("name", "namename");map2.put("type", "123321");
        list2.add(map2);
        result.put("currentDept", list2);
        result.put("orderBy", "fileName");
        result.put("fkNetFileId", "");

        return result;
    }
*/

 /*   @GetMapping("testcache")
    @ResponseBody
    public String testCache(@RequestParam String key){
        log.info("Cache:"+key);
        String s = service.testCache(key);
        return s;
    }*/

    @GetMapping("/getseansession")
    @ResponseBody
    public Map<String, String> getSession(HttpServletRequest request) {
        Map<String, String> attributeMap = new HashMap<String, String>();
        request.getSession().setAttribute("message", request.getRequestURI());
        attributeMap.put("message", request.getRequestURI());
        log.info("sessionID:" + request.getSession().getId());
        return attributeMap;
    }
/*
    @ResponseBody
    @GetMapping("/readtable")
    public String getTable(int n1){
        String result  = "";
        switch (n1){
            case 1:
                result= service.t1();
                break;
            case 2:
                result=service.t2();
                break;
            case 3:
                result=service.t3();
                break;
        }
        return result;
    }*/
}
