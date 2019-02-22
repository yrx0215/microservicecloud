package com.jnshu.microservicecloud.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student implements Serializable{
    private Long id;
    private String userName;
    private String pwd;
    private String phone;
    private Long createAt = System.currentTimeMillis();



}
