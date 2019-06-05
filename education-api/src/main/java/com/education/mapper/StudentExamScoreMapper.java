package com.education.mapper;

import com.education.model.DTO.StudentExamScoreDTO;
import com.education.model.StudentExamScore;

import java.util.List;

public interface StudentExamScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentExamScore record);

    int insertSelective(StudentExamScore record);

    StudentExamScore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentExamScore record);

    int updateByPrimaryKey(StudentExamScore record);

    List<StudentExamScoreDTO> selectStudentExamScoreDTOList(Integer examId);
}