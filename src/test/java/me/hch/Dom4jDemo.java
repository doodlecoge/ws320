package me.hch;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.StringReader;
import java.util.List;

/**
 * Created by hch on 2014/5/1.
 */
public class Dom4jDemo {
    public static void main(String[] args) throws DocumentException {
        String xml = "" +
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<books>" +
                "   <book id=\"001\">" +
                "      <title>Harry Potter</title>" +
                "      <author>J K. Rowling</author>" +
                "   </book>" +
                "   <book id=\"002\">" +
                "      <title>Learning XML</title>" +
                "      <author>Erik T. Ray</author>" +
                "   </book>" +
                "</books>";


        SAXReader reader = new SAXReader();
        Document document = reader.read(new StringReader(xml));

        Element root = document.getRootElement();

        System.out.println(root.getName());

        List<Element> elements = root.elements();

        for (Element element : elements) {
            System.out.println(element.getName());
        }

    }
}
