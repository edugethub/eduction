package com.education.service;

import com.education.model.DTO.StudentExamScoreDTO;

import java.util.List;

/**
 * @program: eduction
 * @description: 考试成绩相关服务
 * @author: duxiangyu
 * @create: 2019-06-05 13:45
 */
public interface StudentExamScoreService {
    List<StudentExamScoreDTO> getScoreChart(Integer examId);
}