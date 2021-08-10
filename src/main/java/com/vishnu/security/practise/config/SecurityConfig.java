package com.vishnu.security.practise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("vishnuram").password("{bcrypt}$2a$12$DmncO3R9anLwApc5/CZPOOlYJlxbGNJnxTS3LhIgKUPfXCgsnBG9W").roles("ADMIN");
    }

    @Bean
    public PasswordEncoder encoderP(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}



