package com.example.platform.web;

import com.example.platform.DemoApplication;
import com.example.platform.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class AdminController {
    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    @Resource
    private ProviderService providerService;

    @RequestMapping("/adminLoginPage")
    public String adminLoginPage(){
        return "admin/adminLoginPage";
    }

    @RequestMapping("/adminLogin")
    public String adminLogin(String name, String pass, Model model){
        //login success
        if (name.equals("admin")&&pass.equals("1to6")){
            LOG.info("admin login");
            model.addAttribute("providers",providerService.getAllProvider());
            return "admin/listOfProvider";//todo forward to another page
        }
        //login fail
        return "admin/adminLoginPage";//todo forward to another page
    }

}
