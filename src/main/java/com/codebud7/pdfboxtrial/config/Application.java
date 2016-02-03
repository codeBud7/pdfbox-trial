package com.codebud7.pdfboxtrial.config;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by s.puskeiler on 29.01.16.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.codebud7.pdfboxtrial.service")
public class Application
{
    private static final Logger logger = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames)
        {
            logger.debug(beanName);
        }
    }


    private void showStartupScreen(ApplicationContext applicationContext)
    {
        logger.info("          ,---,_          ,");
        logger.info("          _>   `'-.  .--'/");
        logger.info("     .--'` ._      `/   <_");
        logger.info("      >,-' ._'.. ..__ . ' '-.");
        logger.info("   .-'   .'`         `'.     '.");
        logger.info("    >   / >`-.     .-'< \\ , '._\\");
        logger.info("   /    ; '-._>   <_.-' ;  '._>");
        logger.info("   `>  ,/  /___\\ /___\\  \\_  /");
        logger.info("   `.-|(|  \\o_/  \\o_/   |)|`");
        logger.info("        \\;        \\      ;/");
        logger.info("         \\  .-,   )-.  /");
        logger.info("          /`  .'-'.  `\\");
        logger.info("         ;_.-`.___.'-.;");
        logger.info("");
        logger.info("");
        logger.info("Context for {} successfully loaded. ({})", applicationContext.getApplicationName(), applicationContext.getId());
    }
}
