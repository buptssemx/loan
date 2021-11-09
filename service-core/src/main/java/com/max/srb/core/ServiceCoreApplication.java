package com.max.srb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname ServiceCoreApplication
 * @Description
 * @Author max
 * @Date 2021/9/13 16:23
 */
@SpringBootApplication
@ComponentScan({"com.max.srb","com.max.common"})
public class ServiceCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class, args);
    }
}
