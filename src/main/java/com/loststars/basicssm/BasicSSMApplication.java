package com.loststars.basicssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.loststars.basicssm.dao")
@EnableTransactionManagement
public class BasicSSMApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicSSMApplication.class, args);
    }
}
