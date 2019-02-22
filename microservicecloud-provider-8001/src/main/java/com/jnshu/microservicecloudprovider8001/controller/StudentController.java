package com.jnshu.microservicecloudprovider8001.controller;

import com.jnshu.microservicecloud.beans.Student;
import com.jnshu.microservicecloudprovider8001.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private DiscoveryClient client;

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

    @RequestMapping(value = "/stu/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-STU");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }


}
