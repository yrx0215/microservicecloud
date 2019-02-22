package com.jnshu.microservicecloud.controller;

import com.jnshu.microservicecloud.beans.Student;
import com.jnshu.microservicecloud.service.StudentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-STU")
public class StudentController {

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
