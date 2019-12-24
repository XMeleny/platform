package com.example.platform.web;

import com.example.platform.Utils;
import com.example.platform.entity.Provider;
import com.example.platform.service.ProviderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ProviderController {
    private static final Logger LOG = LoggerFactory.getLogger(Provider.class);

    @Resource
    ProviderService providerService;

    @RequestMapping("/providerRegisterPage")
    public String providerRegisterPage(){
        return "provider/providerRegisterPage";
    }

    @RequestMapping("/providerRegister")
    public String providerRegister(String name,String pass){
        providerService.save(new Provider(name, Utils.md5(pass)));
        LOG.info("a provider register");
        return "provider/providerRegisterPage";//todo return another page
    }
}
