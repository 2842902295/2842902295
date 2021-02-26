package com.company.test;

import com.company.dao.StudentDao;
import com.company.dao.impl.StudentDaoImpl;
import com.company.pojo.Student;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Data:Created in 15:28
 * @Modified By:
 */
public class StudentDaoTest {
    private StudentDao studentDao=new StudentDaoImpl();

    @Test
    public void addStudent() {
        studentDao.addStudent(new Student(null,"山间客","17300988793",3,"小班","基础班","赵猛"));
    }
    private Integer id;
    private String name;
    private Long mobile;
    private Integer age;
    private String D_class;
    private String grade;
    private String teacher;

    @Test
    public void deleteStudentById() {
        studentDao.deleteStudentById(4);
    }

    @Test
    public void updateStudent() {
        studentDao.updateStudent(new Student(2,"朝阳子","17300988793",3,"大班","飞翔班","赵猛"));
    }

    @Test
    public void queryBookById() {
        System.out.println(studentDao.queryBookById(2));

    }

    @Test
    public void queryStudent() {

        for(Student student:studentDao.queryStudent()){
            System.out.println(student);
        }

    }
}