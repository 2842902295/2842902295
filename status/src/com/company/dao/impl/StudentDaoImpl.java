package com.company.dao.impl;

import com.company.dao.StudentDao;
import com.company.pojo.Student;

import java.util.List;


/**
 * @Description:
 * @Data:Created in 14:24 2/26
 * @Modified By:
 */
public class StudentDaoImpl extends BaseDao implements StudentDao {
    @Override
    public int addStudent(Student student) {

        String sql="INSERT INTO student " +
                "( name, mobile, age, class, grade, teacher )" +
                "VALUES" +
                "(?,?,?,?,?,?)";
        return update(sql,student.getName(),student.getMobile(),student.getAge(),student.getD_class(),student.getGrade(),student.getTeacher());
    }

    @Override
    public int deleteStudentById(Integer id) {
        String sql="delete from student where id = ?";
        return update(sql,id);
    }

    @Override
    public int updateStudent(Student student) {
        String sql="update student set `name`=?,`mobile`=?,`age`=?,`class`=?,`grade`=?,`teacher`=? where id=?";
        return update(sql,student.getName(),student.getMobile(),student.getAge(),student.getD_class(),student.getGrade(),student.getTeacher(),student.getId());
    }

    @Override
    public Student queryBookById(Integer id) {
        String sql="select `id`,`name`,`mobile`,`age`,`class`,`grade`,`teacher` from student where id=?";
        return queryForOne(Student.class,sql,id);
    }

    @Override
    public List<Student> queryStudent() {
        String sql="select `id`,`name`,`mobile`,`age`,`class`,`grade`,`teacher` from student";
        return queryForList(Student.class,sql);
    }
}
