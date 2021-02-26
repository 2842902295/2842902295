package com.company.service.impl;

import com.company.dao.StudentDao;
import com.company.dao.impl.StudentDaoImpl;
import com.company.pojo.Student;
import com.company.service.StudentService;

import java.util.List;

/**
 * @Description:
 * @Data:Created in 17:04 2/26
 * @Modified By:
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao=new StudentDaoImpl();
    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentDao.deleteStudentById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentDao.queryBookById(id);
    }

    @Override
    public List<Student> queryStudents() {
        return studentDao.queryStudent();
    }
}
