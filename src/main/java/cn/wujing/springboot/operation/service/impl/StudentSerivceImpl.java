package cn.wujing.springboot.operation.service.impl;

import cn.wujing.springboot.operation.dao.StudentDao;
import cn.wujing.springboot.operation.entity.Student;
import cn.wujing.springboot.operation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("studentSerivce")
public class StudentSerivceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public String save(Student student) {
        studentDao.saveStudent(student);
        return "保存成功";
    }

    @Override
    public List<Student> findAll() {
       return studentDao.findAllStudent();
    }
}
