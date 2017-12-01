package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder> authenticationManagerBuilderInMemoryUserDetailsManagerConfigurer =
                auth.inMemoryAuthentication();

        authenticationManagerBuilderInMemoryUserDetailsManagerConfigurer
                .withUser("teacher")
                .password("teacher")
                .roles("USER", "ADMIN");

        authenticationManagerBuilderInMemoryUserDetailsManagerConfigurer
                .withUser("student")
                .password("student")
                .roles("USER");
    }
}