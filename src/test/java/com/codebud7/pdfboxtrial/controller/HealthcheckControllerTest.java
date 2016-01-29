package com.codebud7.pdfboxtrial.controller;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by s.puskeiler on 29.01.16.
 */
public class HealthcheckControllerTest
{

    @Test
    public void getResult() throws Exception
    {
        final HealthcheckController healthcheckController = new HealthcheckController();
        assertEquals("ok", healthcheckController.getResult());
    }
}
