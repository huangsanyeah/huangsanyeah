package com.wonders.huangsanyeah;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages={"com.wonders.huangsanyeah.mapper"} )
@SpringBootApplication
public class HuangsanyeahApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuangsanyeahApplication.class, args);
    }

}
