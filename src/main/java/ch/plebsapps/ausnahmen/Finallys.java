package ch.plebsapps.ausnahmen;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Finallys {

    public static void main(String[] args) {
        //tryOhneCatch();
        //finallyXmlCloseUmständlich();
        System.out.println(tryReturnOhneCatch());

    }

    private static void finallyXmlCloseUmständlich() {
        XMLStreamWriter xml = null;
        try {
            PrintWriter printwriter = new PrintWriter("person.xml", StandardCharsets.UTF_8);
            xml = XMLOutputFactory.newInstance().createXMLStreamWriter(printwriter);
            xml.writeStartDocument();
            xml.writeStartElement("person");
            xml.writeCharacters("Irgend ein Name");
            xml.writeEndElement();
        } catch (IOException | XMLStreamException e) {
            e.printStackTrace();
        } finally {
            try {
                xml.close();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }
    }

    private static void tryOhneCatch() {
        try{

        }
        finally {

        }
    }

    private static int tryReturnOhneCatch() {
        try{
            return 0;
        }
        finally {
            return -1;
        }
    }
}
