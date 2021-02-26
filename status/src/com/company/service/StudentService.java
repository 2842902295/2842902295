package com.company.service;

import com.company.pojo.Student;

import java.util.List;

/**
 * @Description:
 * @Data:Created in 17:01 2/26
 * @Modified By:
 */
public interface StudentService {
    public void addStudent(Student student);
    public void deleteStudentById(Integer id);
    public void updateStudent(Student student);
    public Student queryStudentById(Integer id);
    public List<Student> queryStudents();
}
