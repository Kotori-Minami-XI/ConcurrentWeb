package com.Kotori.web;

import com.Kotori.domain.Student;
import com.Kotori.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/selectAllStudent.action")
    public void selectAllStudent() {
        List<Student> students = studentMapper.selectAll();
        System.out.println(students);
    }
}
