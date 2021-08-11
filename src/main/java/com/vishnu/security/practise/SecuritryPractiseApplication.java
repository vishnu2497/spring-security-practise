package com.vishnu.security.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableAutoConfiguration(exclude = UserDetailsServiceAutoConfiguration.class)
public class SecuritryPractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritryPractiseApplication.class, args);
	}

}
