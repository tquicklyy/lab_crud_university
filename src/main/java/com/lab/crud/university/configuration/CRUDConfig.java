package com.lab.crud.university.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.lab.crud.university")
@EnableWebMvc
public class CRUDConfig {

}
