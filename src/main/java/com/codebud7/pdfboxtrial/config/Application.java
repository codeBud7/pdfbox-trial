package com.codebud7.pdfboxtrial.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by s.puskeiler on 29.01.16.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.codebud7.pdfboxtrial")
public class Application
{
    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}
