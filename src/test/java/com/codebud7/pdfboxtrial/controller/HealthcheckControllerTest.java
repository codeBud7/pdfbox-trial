package com.codebud7.pdfboxtrial.controller;

import org.junit.Test;

/**
 * Created by s.puskeiler on 29.01.16.
 */
public class HealthcheckControllerTest
{
    @Test
    public void getResult()
    {
        final HealthcheckController healthcheckController = new HealthcheckController();
        healthcheckController.healthcheck();
    }
}
