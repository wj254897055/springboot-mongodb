package cn.wujing.springboot.operation.dao.impl;

import cn.wujing.springboot.operation.dao.StudentDao;
import cn.wujing.springboot.operation.entity.Student;
import cn.wujing.springboot.util.MongoDbDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl extends MongoDbDao<Student> implements StudentDao {
    @Override
    protected Class<Student> getEntityClass() {
        return Student.class;
    }

    @Override
    public void saveStudent(Student student) {
        super.save(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return super.findAll();
    }
}
