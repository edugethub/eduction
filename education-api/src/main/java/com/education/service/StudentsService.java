package com.education.service;

import com.education.model.Students;

/**
 * @program: eduction
 * @description: 学生
 * @author: duxiangyu
 * @create: 2019-06-04 14:34
 */
public interface StudentsService {
    Students getOne(Integer id);
}