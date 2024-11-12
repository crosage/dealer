package com.powerdealer.dealer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.powerdealer.dealer.module.user.mapper")
public class DealerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealerApplication.class, args);
    }

}
