package com.xiaoyu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.xiaoyu.controller", "com.xiaoyu.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
