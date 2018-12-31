package com.smartcampus.provider;

import com.smartcampus.provider.datasource.DBConfig1;
import com.smartcampus.provider.datasource.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableEurekaClient
@SpringBootApplication
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
@MapperScan(basePackages = { "com.smartcampus.provider.mapper" })
@EnableScheduling
@EnableCaching // 开启缓存注解
public class ProviderApplication {
    public static ConfigurableApplicationContext context = null;
    public static void main(String[] args) {
        context = SpringApplication.run(ProviderApplication.class, args);
    }




}
