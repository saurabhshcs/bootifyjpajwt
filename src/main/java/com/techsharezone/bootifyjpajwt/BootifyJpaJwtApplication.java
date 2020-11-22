package com.techsharezone.bootifyjpajwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class BootifyJpaJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootifyJpaJwtApplication.class, args);
	}

}
