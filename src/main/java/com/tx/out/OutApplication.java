package com.tx.out;

import com.tx.out.config.DummyConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@ServletComponentScan

@EnableConfigurationProperties(DummyConfig.class)
@MapperScan("com.tx.out.dao")
public class OutApplication {


    @Autowired
    private DummyConfig dummyConfig;

    @GetMapping("/health")
    public String health(
        
    ) {
        return "success";
    }

    @GetMapping("/hello")
    public String hello() {
        return dummyConfig.getMessage()
                + " ["
                + new SimpleDateFormat().format(new Date())
                + "]";
    }


    public static void main(String[] args) {
        SpringApplication.run(OutApplication.class, args);
    }

}
