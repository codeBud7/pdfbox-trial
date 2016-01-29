package com.codebud7.pdfboxtrial.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by s.puskeiler on 29.01.16.
 * Returns "ok" if /healthcheck is called, no authentication needed.
 */
@RestController
public class HealthcheckController
{
    final String INFORMATION = "ok";


    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getResult()
    {
        return INFORMATION;
    }
}
