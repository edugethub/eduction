package com.education.api.controller;

import com.education.model.Students;
import com.education.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Autowired
    StudentsService studentsService;
    @RequestMapping("now")
    public  String now(){
        return LocalDateTime.now().toString();
    }
    @RequestMapping("sutdent")
    public Students test(@RequestParam("id") Integer id){
        return studentsService.getOne(id);
    }

}