package com.education;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 * 功能描述: 
 *
 * @param: 
 * @return: 
 * @auther: duxiangyu
 * @date: 2019/6/4 0004 下午 3:01
 */
@SpringBootApplication
@MapperScan("com.education.mapper")
public class EducationApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationApiApplication.class, args);
    }

}
