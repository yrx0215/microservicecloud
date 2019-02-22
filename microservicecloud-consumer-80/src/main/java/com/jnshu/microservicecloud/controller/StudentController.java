package com.jnshu.microservicecloud.controller;

import com.jnshu.microservicecloud.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class StudentController {

//    private static final  String REST_URL = "http://localhost:8001";
    private static final  String REST_URL = "http://MICROSERVICECLOUD-STU";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/stu/add")
    public Boolean  add(Student student){
        return restTemplate.postForObject(REST_URL+ "/stu/add",student,Boolean.class);
    }

    @RequestMapping(value = "/consumer/stu/{id}")
    public Student get(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL+ "/stu/" + id,Student.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/stus")
    public List<Student> list(){
        return restTemplate.getForObject(REST_URL+ "/stus",List.class);
    }


    @RequestMapping(value="/consumer/stu/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(REST_URL+ "/stu/discovery", Object.class);
    }


}
