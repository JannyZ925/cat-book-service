package com.ccsu.catbookservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.ccsu.catbookservice.dao")
@EnableTransactionManagement
public class CatBookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatBookServiceApplication.class, args);
    }

}
