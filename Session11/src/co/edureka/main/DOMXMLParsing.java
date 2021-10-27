package co.edureka.main;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMXMLParsing {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			// Document Object represents the XML Structure in Java Program
			Document document = builder.parse(file);
			
			System.out.println("ROOT ELEMENT: "+document.getDocumentElement().getNodeName());
			
			NodeList nodes = document.getElementsByTagName("employee");
			System.out.println("Total Employee Tags Found: "+nodes.getLength());
			
			
			for(int i=0;i<nodes.getLength();i++) {
				
				Node node = nodes.item(i);
				Element element = (Element)node;
				
				System.out.println(element.getElementsByTagName("eid").item(0).getTextContent());
				System.out.println(element.getElementsByTagName("name").item(0).getTextContent());
				System.out.println(element.getElementsByTagName("salary").item(0).getTextContent());
				System.out.println(element.getElementsByTagName("designation").item(0).getTextContent());
				
				System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
