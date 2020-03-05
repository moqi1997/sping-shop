package com.moqi.shop.springboot.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author moqi
 * @date 2020/3/3 13:16
 */
@EnableDubboConfiguration
@SpringBootApplication
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class);
    }
}

