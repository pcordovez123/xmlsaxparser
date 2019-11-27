package net.osgg.xmlsaxparser;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomHandler extends DefaultHandler {
	boolean bfirstName = false;
    boolean blastName= false;
    boolean bnickName = false;
    boolean bsalary = false;
    
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //System.out.println("starts element:" + qName);
        if (qName.equalsIgnoreCase("employee")) {
            String id = attributes.getValue("empid");
            System.out.println("empid: " + id);
        }
        if (qName.equalsIgnoreCase("firstname")) {
            bfirstName = true;
        }
        if (qName.equalsIgnoreCase("lastname")) {
            blastName = true;
        }
        if (qName.equalsIgnoreCase("nickname")) {
            bnickName = true;
        }
        if (qName.equalsIgnoreCase("salary")) {
            bsalary = true;
        }
    }
    
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //System.out.println("ends element:" + qName);
    }
    
    public void characters(char ch[], int start, int length) throws SAXException {
        if (bfirstName) {
            System.out.println("Firstname: " + new String(ch, start, length));
            bfirstName = false;
        }
        if (blastName) {
            System.out.println("Lastname: " + new String(ch, start, length));
            blastName = false;
        }
        if (bnickName) {
            System.out.println("Nickname: " + new String(ch, start, length));
            bnickName = false;
        }
        if (bsalary) {
            System.out.println("Nickname: " + new String(ch, start, length));
            bsalary = false;
        }
    }
}
