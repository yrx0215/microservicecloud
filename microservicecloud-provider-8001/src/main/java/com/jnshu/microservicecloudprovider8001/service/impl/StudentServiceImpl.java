package com.jnshu.microservicecloudprovider8001.service.impl;

import com.jnshu.microservicecloud.beans.Student;
import com.jnshu.microservicecloudprovider8001.mapper.StudentMapper;
import com.jnshu.microservicecloudprovider8001.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Boolean add(Student student) {
        return studentMapper.addStu(student);
    }

    @Override
    public Student get(Long id) {
        return studentMapper.findStuById(id);
    }

    @Override
    public List<Student> list() {
        return studentMapper.findAllStu();
    }
}
