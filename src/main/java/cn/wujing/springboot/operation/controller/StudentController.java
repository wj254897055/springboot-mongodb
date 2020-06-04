package cn.wujing.springboot.operation.controller;

import cn.wujing.springboot.operation.entity.Student;
import cn.wujing.springboot.operation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentSerivce;

    @GetMapping("/all")
    private List<Student> getStudents(){
        return studentSerivce.findAll();
    }



}
