package me.hch;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

/**
 * Created by hch on 2014/4/5.
 */
public class MarshallerSample {
    public static void main(String[] args) throws JAXBException, IOException {
        FooCls fooObj = new FooCls();
        fooObj.setId(100);
        fooObj.setName("Class Name中文");


        File tempFile = File.createTempFile("FooCls", "obj");

        JAXBContext jaxbContext = JAXBContext.newInstance(FooCls.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "utf8");

        jaxbMarshaller.marshal(fooObj, tempFile);
        jaxbMarshaller.marshal(fooObj, System.out);
        System.out.println();

        Unmarshaller um = jaxbContext.createUnmarshaller();
        FooCls obj = (FooCls) um.unmarshal(tempFile);

        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
