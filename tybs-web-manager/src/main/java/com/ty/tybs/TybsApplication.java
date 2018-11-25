package com.ty.tybs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("${scan.packages}")
@MapperScan("com.ty.tybs.web.mapper")
@EnableFeignClients //开启FeignClients
@EnableEurekaClient  //開起EurekaClient
public class TybsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TybsApplication.class, args);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("========================================================================");
        System.out.println("------------------tybsAppliction is successful started up---------------");
        System.out.println("========================================================================");
        System.out.println("------------------------------------------------------------------------");
    }
}
