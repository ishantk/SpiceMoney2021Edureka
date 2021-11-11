package co.edureka.ws;

// New is a Web Service
public class News {

	// Web Method
	public String getNews(String city) {
		
		String news = "";
		
		if(city.equals("Bangalore")) {
			news = "Bangalore is running out of Water. Please save every drop";
		}else if(city.equals("Delhi")) {
			news = "Delhi is recorded with a high index of pollution";
		}else {
			news = "No News Available for "+city;
		}
		
		return news;
	}
	
	public int getRate(String digitalCurrency) {
		
		int price = 0;
		
		if(digitalCurrency.equals("bitcoin")) {
			price = 500000;
		}else if(digitalCurrency.equals("ethereum")) {
			price = 300000;
		}else {
			price = 100;
		}
		
		return price;
	}
	
}
