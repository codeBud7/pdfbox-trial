package com.codebud7.pdfboxtrial.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by s.puskeiler on 29.01.16.
 */
@RestController
class HealthcheckController
{
    private static final Logger logger = LoggerFactory.getLogger(HealthcheckController.class);


    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public void healthcheck()
    {
        logger.info("healthcheck called");
    }
}
