package com.jnshu.microservicecloud.controller;

import com.jnshu.microservicecloud.service.StudentService;
import com.jnshu.microservicecloud.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {



    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/stu/add",method = RequestMethod.POST)
    public Boolean add(@RequestBody Student student){
        return studentService.add(student);
    }

    @RequestMapping(value = "/stu/{id}",method = RequestMethod.GET)
    public Student get(@PathVariable("id") Long id){
        return studentService.get(id);
    }

    @RequestMapping(value = "/stus",method = RequestMethod.GET)
    public List<Student> getAll(){
        return studentService.list();
    }



}
