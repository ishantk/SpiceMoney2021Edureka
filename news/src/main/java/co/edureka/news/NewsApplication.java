package co.edureka.news;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Make your NewsApplication a Controller which shall solve the purpose of a web service
public class NewsApplication {

	
	@GetMapping("/")
	public String welcome() {
		return "<center>Welcome to Spring Boot App</center>";
	}
	
	@GetMapping("/news")
	public String getNews() {
		return "Bagalore is running out of Water";
	}
	
	@GetMapping("/cases")
	@ResponseBody // Makes the Response as JSON
	public HashMap<String, Integer> getCovidCases() {
		
		HashMap<String, Integer> cases = new HashMap<String, Integer>();
		cases.put("Punjab", 5234);
		cases.put("Homachal", 234);
		cases.put("Delhi", 2321);
		cases.put("Karnataka", 4234);
		cases.put("Maharashtra", 7234);
		
		return cases;
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(NewsApplication.class, args);
	}

}
