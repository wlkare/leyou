package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: LyApiGateway
 * @description: 网关
 * @author: Mr.Wang
 * @create: 2019-10-11 15:25
 * @Version 1.0
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class LyApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(LyApiGateway.class, args);
    }
}
