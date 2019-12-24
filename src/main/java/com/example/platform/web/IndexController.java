package com.example.platform.web;

import com.example.platform.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    @RequestMapping("/")
    public String index(){
//        return "/index";
        return "provider/providerRegisterPage";
    }


}
