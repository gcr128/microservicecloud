package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaServer7002_App extends SpringBootServletInitializer
//public class EurekaServer7002_App
{

    /**
     * 项目更改为tomcat启动时，需重写configure方法
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EurekaServer7002_App.class);
    }

    public static void main(String[] args)
    {
       SpringApplication.run(EurekaServer7002_App.class, args);
    }
}