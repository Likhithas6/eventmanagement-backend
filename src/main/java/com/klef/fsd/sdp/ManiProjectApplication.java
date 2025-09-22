package com.klef.fsd.sdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ManiProjectApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ManiProjectApplication.class, args);
        System.out.println("backend is Running Successfully !!...");
    }

    // Required for WAR deployment in external Tomcat
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ManiProjectApplication.class);
    }
}
