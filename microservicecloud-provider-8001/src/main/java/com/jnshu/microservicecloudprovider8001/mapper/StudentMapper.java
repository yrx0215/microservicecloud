package com.jnshu.microservicecloudprovider8001.mapper;

import com.jnshu.microservicecloud.beans.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentMapper {

    Student findStuById(Long id);

    List findAllStu();

    Boolean addStu(Student student);

}
