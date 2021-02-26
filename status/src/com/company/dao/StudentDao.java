package com.company.dao;

import com.company.pojo.Student;
import org.junit.Test;

import java.util.List;

/**
 * @Description:
 * @Data:Created in 13:35 2/26
 * @Modified By:
 */
public interface StudentDao {
     public int addStudent(Student student);

     public int deleteStudentById(Integer id);

     public int updateStudent(Student student);

     public Student queryBookById(Integer id);

     public List<Student> queryStudent();
}
