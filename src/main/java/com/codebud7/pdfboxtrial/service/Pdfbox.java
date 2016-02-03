package com.codebud7.pdfboxtrial.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

/**
 * Created by s.puskeiler on 01.02.16.
 */
public class PdfBox
{
    public PdfBox()
    {
    }

    public String extractText(final String filename) throws IOException
    {
        File file = new File(filename);
        PDFParser pdfParser = new PDFParser(new FileInputStream(file));
        pdfParser.parse();
        COSDocument cosDocument = pdfParser.getDocument();

        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        return pdfTextStripper.getText(new PDDocument(cosDocument));
    }
}
