final class CA{ // cannot be inherited
	final void show() { // cannot be overrided
		System.out.println("Show in CA");
	}
}

/*class CB extends CA{
	void show() {
		System.out.println("Show in CB");
	}
}*/

public class FinalKeyword {

	public static void main(String[] args) {
		
		int a = 10;
		a = 10;
		
		final int b = 10;
		//b = 20; // error
		
		final String HOST = "https://abc.com/";
		final String APP_NAME = "edureka";

	}

}
