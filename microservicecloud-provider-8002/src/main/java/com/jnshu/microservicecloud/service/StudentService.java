package com.jnshu.microservicecloud.service;

import com.jnshu.microservicecloud.beans.Student;

import java.util.List;

public interface StudentService {
    public Boolean add(Student student);
    public Student get(Long id);
    public List<Student> list();
}
