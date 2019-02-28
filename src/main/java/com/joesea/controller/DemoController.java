package com.joesea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>@author : Joesea Lea</p>
 * <p>@date : 2019/2/28</p>
 * <p>@description : </p>
 */
@Controller
@RequestMapping(value = "/demo")
public class DemoController {
    
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
