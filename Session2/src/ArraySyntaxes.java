
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// Implicit way to create array
		int[] array1 = {10, 20, 30, 40, 50};

		// Explicit way to create array
		int[] array2 = new int[]{10, 20, 30, 40, 50};
		
		//  new int[] is the instruction which creates array at run time in the heap area
		//  if we do not use this new int[], compiler will automatically append at compilation
		
		// Create Array with Elements by passing the Size
		int[] array3 = new int[5];
		// create 5 elements from index 0 to 4 and 
		// every element will be initialized to default value of 0
		
		// int -> default value : 0
		// float -> default value : 0.0
		// character -> default value : ''
		// boolean -> default value : false
		
		// update the values in array
		array3[2] = 22;
		
		for(int element: array3) {
			System.out.println(element);
		}
		System.out.println("~~~~~");
		// brackets after
		int array4[] = new int[5];
		
		for(int element: array4) {
			System.out.println(element);
		}
		
		//int a[], b;
		//a = new int[5];
		//b = 10;
		
		int[] a, b;
		a = new int[5]; // all elements are 0
		b = new int[10];
		
		// We will get an error ArrayIndexOutOfBoundsException if we access an index which does not exist
		//System.out.println("a[10] is: "+a[10]);
	}

}
