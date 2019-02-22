package com.jnshu.microservicecloud.controller;

import com.jnshu.microservicecloud.beans.Student;
import com.jnshu.microservicecloud.service.StudentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

//    private static final  String REST_URL = "http://localhost:8001";
    private static final  String REST_URL = "http://MICROSERVICECLOUD-STU";

    @Autowired
    private StudentClientService studentClientService ;

    @RequestMapping(value = "/consumer/stu/add",method = RequestMethod.POST)
    public Boolean add(@RequestBody Student student){
        return studentClientService.add(student);
    }

    @RequestMapping(value = "/consumer/stu/{id}",method = RequestMethod.GET)
    public Student get(@PathVariable("id") Long id){
        return studentClientService.get(id);
    }

    @RequestMapping(value = "/consumer/stus",method = RequestMethod.GET)
    public List<Student> getAll(){
        return studentClientService.getAll();
    }





}
