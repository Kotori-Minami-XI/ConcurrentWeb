package com.Kotori.mapper;

import com.Kotori.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Long studentId);

    int insert(Student record);

    Student selectByPrimaryKey(Long studentId);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);
}