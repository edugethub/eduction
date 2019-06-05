package com.education.service.impl;

import com.education.mapper.StudentExamScoreMapper;
import com.education.model.DTO.StudentExamScoreDTO;
import com.education.service.StudentExamScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: eduction
 * @description: 考试成绩相关服务
 * @author: duxiangyu
 * @create: 2019-06-05 13:46
 */
@Service
public class StudentExamScoreServiceImpl implements StudentExamScoreService {

    @Autowired
    StudentExamScoreMapper studentExamScoreMapper;
    @Override
    public List<StudentExamScoreDTO> getScoreChart(Integer examId){
        List<StudentExamScoreDTO> result =studentExamScoreMapper.selectStudentExamScoreDTOList(examId);
        return  result;
    }
}