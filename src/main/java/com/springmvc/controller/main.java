package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @program: ssmshiro
 * @description: 人间有味是清欢
 * @author: liuSha.pufengjun
 * @create: 2018-07-30 10:15
 **/
@Controller
public class main {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return  "Hello controller!";
    }
}
