package com.main.uploadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.main.uploadfile")
public class UploadfileApplication {
	public static void main(String[] args) {
		SpringApplication.run(UploadfileApplication.class, args);
	}
}
