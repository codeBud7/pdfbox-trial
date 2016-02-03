package com.codebud7.pdfboxtrial.controller;

import com.codebud7.pdfboxtrial.service.PdfBox;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by s.puskeiler on 29.01.16.
 */
@RestController
class ExtractController
{
    private static final Logger logger = LoggerFactory.getLogger(ExtractController.class);

    private PdfBox pdfBox = new PdfBox();


    @RequestMapping(value = "/v1/pdf/extract", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity extractText(@PathVariable final String filename)
    {
        try
        {
            String extractedText = pdfBox.extractText(filename);
            logger.info(extractedText);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (IOException e)
        {
            logger.error(e.toString());
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
