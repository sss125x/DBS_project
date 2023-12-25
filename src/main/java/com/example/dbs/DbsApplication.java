package com.example.dbs;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.dbs.*.mapper")
@SpringBootApplication
public class DbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbsApplication.class, args);
    }

}
