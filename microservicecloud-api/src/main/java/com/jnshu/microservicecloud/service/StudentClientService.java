package com.jnshu.microservicecloud.service;

import com.jnshu.microservicecloud.beans.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MICROSERVICECLOUD-STU")
public interface StudentClientService {

    @RequestMapping(value = "/stu/add",method = RequestMethod.POST)
    public Boolean add(@RequestBody Student student);

    @RequestMapping(value = "/stu/{id}", method = RequestMethod.GET)
    public Student get(@PathVariable("id") Long id);

    @RequestMapping(value = "/stus",method = RequestMethod.GET)
    public List<Student> getAll();

}
