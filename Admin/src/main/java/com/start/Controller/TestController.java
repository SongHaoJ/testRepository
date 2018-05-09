package com.start.Controller;


import com.test.Service.TestService;
import com.test.ServiceIMPL.TestServiceimpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class TestController {

    public static final Logger log = LoggerFactory.getLogger(TestController.class);

    TestService service = new TestServiceimpl();


    @GetMapping("testcache")
    @ResponseBody
    public String testCache(@RequestParam String key) {
        log.info("Cache:" + key);
        String s = service.testCache(key);
        return s;
    }

    @GetMapping("/getseansession")
    @ResponseBody
    public Map<String, String> getSession(HttpServletRequest request) {
        Map<String, String> attributeMap = new HashMap<String, String>();
        request.getSession().setAttribute("message", request.getRequestURI());
        attributeMap.put("message", request.getRequestURI());
        log.info("sessionID:" + request.getSession().getId());
        return attributeMap;
    }
}
