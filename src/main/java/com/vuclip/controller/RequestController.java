package com.vuclip.controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class RequestController {

    @RequestMapping("languageTranslation")
    public String translateOtherLanguagesToEnglish() {
        System.out.println("Inside languageTranslation");
        return "Success";
    }
    
    @RequestMapping("trendData")
    public String trendDataFromFile() {
        System.out.println("Inside trendData");
        return "Success";
    }
    
    @RequestMapping("classifyData")
    public String classifyDataFromFile() {
        System.out.println("Inside classifyData");
        return "Success";
    }

}