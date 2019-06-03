package com.education.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @program: eduction
 * @description: 测试用controller
 * @author: duxiangyu
 * @create: 2019-06-03 15:55
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("now")
    public  String now(){
        return LocalDateTime.now().toString();
    }

}