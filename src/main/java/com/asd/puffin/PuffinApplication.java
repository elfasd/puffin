package com.asd.puffin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.asd.puffin.modules.mapper")
public class PuffinApplication {
	public static void main(String[] args) {
		SpringApplication.run(PuffinApplication.class, args);
	}
}
