package com.jnshu.microservicecloudprovider8001;

import com.jnshu.microservicecloudprovider8001.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroservicecloudProvider8001ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private StudentService studentService;

	@Test
	public void test(){
		studentService.list();

		System.out.println(studentService.get(1L));
	}

}
