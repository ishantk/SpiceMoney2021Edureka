import java.util.Scanner; // Scanner can be used to read from Console

public class ScannerForInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter Your Age: ");
		int age = scanner.nextInt();
		
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		

	}

}
