package com.education.api.controller;

import com.education.api.out.ApiResult;
import com.education.model.DTO.StudentExamScoreDTO;
import com.education.model.StudentExamScore;
import com.education.service.StudentExamScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: eduction
 * @description: 考试相关接口
 * @author: duxiangyu
 * @create: 2019-06-05 11:21
 */
@RestController
@RequestMapping("exam")
public class ExamController {
    @Autowired
    StudentExamScoreService studentExamScoreService;
    /**
     *
     * 功能描述:天梯榜
     *
     * @param:
     * @return:
     * @auther: duxiangyu
     * @date: 2019/6/5 0005 上午 11:33
     */
    @RequestMapping("getScoreChart")
    public ApiResult<List<StudentExamScoreDTO>> getScoreChart(@RequestParam Integer examId){
       List<StudentExamScoreDTO> resultData= studentExamScoreService.getScoreChart(examId);
       return  ApiResult.sucess(resultData);
    }
}