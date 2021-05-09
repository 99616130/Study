package com.peng.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//启动类
@SpringBootApplication
@MapperScan("com.peng.server.mapper")
public class Systemapplication {

    public static void main(String[] args){
        SpringApplication.run(Systemapplication.class,args);
    }
}
