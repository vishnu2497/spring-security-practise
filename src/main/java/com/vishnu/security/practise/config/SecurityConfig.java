package com.vishnu.security.practise.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity(debug = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    AccessDeniedHandlerDemo handlerDem;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("vishnuram").password("{noop}vvv").roles("STUDENT");
        auth.inMemoryAuthentication().withUser("abcd").password("{noop}abcd").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/view/login", "/view/error", "/view/noaccess").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/view/login")
                .and()
                .exceptionHandling().accessDeniedHandler(handlerDem)
                .and()
                .httpBasic();

    }

    @Bean
    public PasswordEncoder encoderP() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }


    /*@Bean
    public UserDetailsService abcs() {
        UserDetails vvU = User.builder()
                .username("vv")
                .password("{noop}asas")
                .roles("QWER")
                .build();

        return new InMemoryUserDetailsManager(vvU);
    }*/
//
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        // ALTHOUGH THIS SEEMS LIKE USELESS CODE,
//        // IT'S REQUIRED TO PREVENT SPRING BOOT AUTO-CONFIGURATION
//        return super.authenticationManagerBean();
//    }
}



