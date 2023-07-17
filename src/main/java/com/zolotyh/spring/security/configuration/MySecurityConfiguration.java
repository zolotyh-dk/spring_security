package com.zolotyh.spring.security.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@EnableWebSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("dmitry")
                        .password("dmitry")
                        .roles("EMPLOYEE"))
                .withUser(userBuilder.username("aleksandra")
                        .password("aleksandra")
                        .roles("HR"))
                .withUser(userBuilder.username("aleksey")
                        .password("aleksey")
                        .roles("MANAGER", "HR"));
    }
}
