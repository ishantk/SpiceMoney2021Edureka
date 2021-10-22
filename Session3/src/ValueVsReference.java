// 1. Methods in Memory
// 2. Pass by Value 
// 3. Pass by Reference

public class ValueVsReference {

	static void sayHello() {
		System.out.println("Hello");
	}
	
	static void sayBye() {
		sayHello();
		System.out.println("Bye");
	}
	
	static void square(int num) {
		System.out.println("[square] num is: "+num);  // 10
		num = num * num;
		System.out.println("[square] num now is: "+num); // 100
	}
	
	static void squareOfNumbers(int[] nums) {
		for(int idx=0;idx<nums.length;idx++) {
			nums[idx] = nums[idx]*nums[idx];
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[main] Started");
		
		//sayBye();
		
		int num = 10;
		int age = 20;
		int[] numbers = {10, 20, 30, 40, 50};
		
		System.out.println("[main] num is: "+num); // 10
		
		// PASS BY VALUE :)
		square(num); // copy of the data in num which we can pass to the other method :)
		
		System.out.println("[main] num now is: "+num); // 10

		System.out.print("[main] numbers: ");
		for(int n : numbers) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		// PASS BY REFERENCE
		squareOfNumbers(numbers); // copy of the data which here is HashCode is passed to the other method :)
		
		System.out.print("[main] numbers now are: ");
		for(int n : numbers) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("[main] Finished");
	}

}
