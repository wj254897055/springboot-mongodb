package cn.wujing.springboot.operation.service;

import cn.wujing.springboot.operation.entity.Student;

import java.util.List;

public interface StudentService {
    public String save(Student student);

    List<Student> findAll();
}
