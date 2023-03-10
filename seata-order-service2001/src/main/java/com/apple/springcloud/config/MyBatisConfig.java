package com.apple.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.apple.springcloud.dao"})
public class MyBatisConfig {
}
