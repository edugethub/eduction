package com.education.model.DTO;

import com.education.model.StudentExamScore;

/**
 * @program: eduction
 * @description: 考试成绩模型
 * @author: duxiangyu
 * @create: 2019-06-05 11:35
 */
public class StudentExamScoreDTO extends StudentExamScore {
    private  String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}