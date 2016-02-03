package com.codebud7.pdfboxtrial.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

/**
 * Created by s.puskeiler on 01.02.16.
 */
public class ExtractControllerTest
{
    @Test
    public void extractText()
    {
        final ExtractController extractController = new ExtractController();
        ResponseEntity responseEntity = extractController.extractText("/");

        Assert.assertNotNull(responseEntity);
    }
}
