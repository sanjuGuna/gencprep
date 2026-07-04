package com.crudproject.restoperations.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name="stu_name")
    private String name;
    @Column(name="stu_age")
    private int age;
    @Column(name="stu_dept")
    private String dept;

    public Student(){}
    public Student(String name, int age, String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getDept() {
        return dept;
    }
}
