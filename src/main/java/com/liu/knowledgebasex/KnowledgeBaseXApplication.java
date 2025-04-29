package com.liu.knowledgebasex;

import org.apache.commons.logging.Log;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@MapperScan("com.liu.knowledgebasex.mapper")
public class KnowledgeBaseXApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnowledgeBaseXApplication.class, args);
	}

}
