package com.cyyz.cy_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.cyyz.cy_system")
@SpringBootApplication
public class CySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CySystemApplication.class, args);
	}
}
