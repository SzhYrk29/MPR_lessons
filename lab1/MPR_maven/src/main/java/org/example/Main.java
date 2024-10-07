package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        PDPage page2 = new PDPage();
        PDPage page3 = new PDPage();
        PDPage page4 = new PDPage();
        PDPage page5 = new PDPage();
        PDPage page6 = new PDPage();
        PDPage page7 = new PDPage();
        PDPage page8 = new PDPage();
        PDPage page9 = new PDPage();
        PDPage page10 = new PDPage();

        PDPageContentStream stream = new PDPageContentStream(document, page);
        stream.beginText();
        stream.setFont(new PDType1Font(Standard14Fonts.FontName.TIMES_ROMAN), 14);
        stream.newLineAtOffset(25, 500);
        stream.showText("Hello World");
        stream.endText();
        stream.close();

        PDPageContentStream stream1 = new PDPageContentStream(document, page10);
        stream1.beginText();
        stream1.setFont(new PDType1Font(Standard14Fonts.FontName.TIMES_ROMAN), 14);
        stream1.newLineAtOffset(25, 500);
        stream1.showText("Goodbye World");
        stream1.endText();
        stream1.close();

        document.addPage(page);
        document.addPage(page2);
        document.addPage(page3);
        document.addPage(page4);
        document.addPage(page5);
        document.addPage(page6);
        document.addPage(page7);
        document.addPage(page8);
        document.addPage(page9);
        document.addPage(page10);
        document.save("kapibara.pdf");
        document.close();
    }
}