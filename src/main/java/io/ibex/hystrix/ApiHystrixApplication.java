package io.ibex.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableDiscoveryClient
@SpringBootApplication
public class ApiHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiHystrixApplication.class, args);
    }

}

