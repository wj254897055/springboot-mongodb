package cn.wujing.springboot.operation.dao;

import cn.wujing.springboot.operation.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentDao  {

    public void saveStudent(Student student);

    public List<Student> findAllStudent();
}
