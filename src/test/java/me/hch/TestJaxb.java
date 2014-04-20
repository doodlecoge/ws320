package me.hch;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 14-4-20.
 */
public class TestJaxb {
    public static void main(String[] args) throws JAXBException, IOException {
        Person person = new Person();
        person.setAge(100);
        person.setName("Abc");

        JAXBContext context = null;
        context = JAXBContext.newInstance(Person.class);
        context.createMarshaller().marshal(person, System.out);

        context.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                File file = new File(suggestedFileName);
                StreamResult result = new StreamResult(file);
                result.setSystemId(file.toURI().toURL().toString());
                return result;
            }
        });
    }
}
