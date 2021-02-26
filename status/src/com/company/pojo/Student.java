package com.company.pojo;

/**
 * @Description:
 * @Data:Created in 13:28 2/26
 * @Modified By:
 */
public class Student {
    private Integer id;
    private String name;
    private String mobile;
    private Integer age;
    private String D_class;
    private String grade;
    private String teacher;

    public Student() {
    }

    public Student(Integer id, String name, String mobile, Integer age, String d_class, String grade, String teacher) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        D_class = d_class;
        this.grade = grade;
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getD_class() {
        return D_class;
    }

    public void setD_class(String d_class) {
        D_class = d_class;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                ", age=" + age +
                ", D_class='" + D_class + '\'' +
                ", grade='" + grade + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
