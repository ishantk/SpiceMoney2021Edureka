package co.edureka.main;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println("Start of XML Parsing");
	}
	
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.print("<"+qName+">");
	}
	
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch, start, length);
		System.out.print(data);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("End of XML Parsing");		
	}
}

public class SAXXMLParsing {

	public static void main(String[] args) {
		
		try {
			
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
			FileInputStream stream = new FileInputStream(file);
			
			MyHandler handler = new MyHandler();
			
			parser.parse(stream, handler);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		

	}

}
