package net.wanho.mapper;

import net.wanho.pojo.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> getAllStus();


    void addStu(Student student);
}
