package com.scsj.run;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/** 
 * @ClassName: SpringBootApplication 
 * @Description: SpringBootApplication 项目启动类
 * @author NanTian
 * @date 2018年5月4日 下午2:29:12 
*/
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
