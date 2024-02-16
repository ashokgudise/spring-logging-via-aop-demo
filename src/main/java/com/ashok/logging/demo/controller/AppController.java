package com.ashok.logging.demo.controller;

import com.ashok.logging.demo.service.AppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private AppService appService;

    public AppController(AppService appService){
        this.appService = appService;
    }


    @GetMapping("/")
    public String demoCall(){
        appService.appServiceCall();
        return "App Works";
    }


}
