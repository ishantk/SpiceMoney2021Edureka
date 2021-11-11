package co.edureka.restws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// Configure ServletContainer in web.xml 
//import org.glassfish.jersey.servlet.ServletContainer;

// Web Service
@Path("/news")
public class News {
	
	// Web Method
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTextNews() {
		
		String news = "Balgalore is runnit out of water. Please save every drop";
		return news;
	}
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLNews() {
		String news = "<html><body><center><h3>Balgalore is runnit out of water. Please save every drop</h3></center></body></html>";
		return news;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getXMLNews() {
		String news = "<?xml version='1.0' charset='UTF-8'?><news>Balgalore is runnit out of water. Please save every drop</news>";
		return news;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getJSONNews() {
		String news = "{'news': 'Balgalore is runnit out of water. Please save every drop', 'publishedAt': '10/1/2020'}";
		return news;
	}

}
