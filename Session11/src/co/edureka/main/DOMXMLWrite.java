package co.edureka.main;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import co.edureka.model.Employee;

public class DOMXMLWrite {

	public static void main(String[] args) {
		
		try {
			
			// How to create XML from Java Program
			Employee employee = new Employee("E101", "David Watson", 50000, "Software Engineer");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			// Document Object represents the XML Structure in Java Program
			Document document = builder.newDocument();
			
			// Create Elements for XML
			Element elementRoot = document.createElement("employees");
			Element elementEmployee = document.createElement("employee");
			Element elementEID = document.createElement("eid");
			Element elementName = document.createElement("name");
			Element elementSalary = document.createElement("salary");
			Element elementDesignation = document.createElement("designation");
			
			// Data in the elements
			Text textEID = document.createTextNode(employee.eid);
			Text textName = document.createTextNode(employee.name);
			Text textSalary = document.createTextNode(String.valueOf(employee.salary));
			Text textDesignation = document.createTextNode(employee.designation);
			
			// Create the hierarchy
			elementEID.appendChild(textEID);
			elementName.appendChild(textName);
			elementSalary.appendChild(textSalary);
			elementDesignation.appendChild(textDesignation);
			
			elementEmployee.appendChild(elementEID);
			elementEmployee.appendChild(elementName);
			elementEmployee.appendChild(elementSalary);
			elementEmployee.appendChild(elementDesignation);

			elementRoot.appendChild(elementEmployee);
			
			document.appendChild(elementRoot);
			
			// Transform the Document Object into an XML File
			// API: Transformer -> is obtained using TransformerFactory
			//      DOMSource StreamResult
			
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();
			
			// Document Object with Data
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new FileOutputStream("/Users/ishantkumar/Downloads/my-employees.xml"));
			
			// Write the data into XML File
			transformer.transform(source, result);
			System.out.println("XML FILE WRITTEN");
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}

	}

}
