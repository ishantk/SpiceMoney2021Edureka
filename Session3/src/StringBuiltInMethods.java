
public class StringBuiltInMethods {

	public static void main(String[] args) {
		
		String names = "john, jennie, jim, jack, joe";
		int length = names.length();
		System.out.println("Length is: "+length);
		
		//char ch = names.charAt(0);
		char ch = names.charAt(length-1);
		System.out.println("ch is: "+ch);
		
		//String name = names.substring(6); // from 6 to end
		String name = names.substring(6, 12); // from 6 to <12 i.e. 11
		System.out.println(name);
		
		String[] array = names.split(",");
		for(String s : array) {
			System.out.println(s.trim());
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".com")) {
			System.out.println("Its a Valid Email");
		}else {
			System.out.println("InValid Email");
		}

		String[] contacts = {
				"Harry",
				"George",
				"Jack",
				"Sia",
				"Jim",
				"Kim",
				"Leo",
				"Mike"
		};
		
		System.out.println("---------");
		System.out.println("Contacts:");
		
		String searchKeyword = "im";
		
		for(String s : contacts) {
			//if(s.contains(searchKeyword)) {
			//if(s.startsWith(searchKeyword)) {
			if(s.endsWith(searchKeyword)) {
				System.out.println(s);
			}
		}
		
		//int idx = names.indexOf('n');
		int idx = names.lastIndexOf('n');
		System.out.println("idx for n is: "+idx);
		
		String replacedNames = names.replace('j', 'k');
		System.out.println("replacedNames: "+replacedNames);
		
	}

}
