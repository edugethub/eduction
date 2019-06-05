package com.education.service.impl;

import com.education.mapper.StudentsMapper;
import com.education.model.Students;
import com.education.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: eduction
 * @description: 学生
 * @author: duxiangyu
 * @create: 2019-06-04 14:35
 */
@Service
public class StudentServiceImpl implements StudentsService {
    @Autowired
    StudentsMapper studentsMapper;
    @Override
    public Students getOne(Integer id){
        return  studentsMapper.selectByPrimaryKey(id);
    }
}