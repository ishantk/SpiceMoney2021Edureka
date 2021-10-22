
public class MultiDimArrays {

	public static void main(String[] args) {
		
		// Array of Arrays -> Matrix can be represented with Array of Arrays
		int[][] array = {
							{10, 20, 30}, // 0
							{40, 50, 60}, // 1
							{70, 80, 90}, // 2
							{10, 20, 30}, // 3
							{40, 50, 60}  // 4
						};

		System.out.println("array is: "+array); // HashCode
		System.out.println("array length is: "+array.length); // 5
		
		System.out.println("array[0] is: "+array[0]); // HashCode 
		System.out.println("array[0] length is: "+array[0].length); // 3
		
		System.out.println(array[1][0]);
		
		// Create an Array of Arrays
		// 5 Arrays with each array having 3 elements
		// all the elements will be 0
		int[][] array1 = new int[5][3];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
		
		// TASK:
		// To represent the data from https://www.covid19india.org/ in MultiDimensionalArrays
		// Take some 5 states of data
		// List the state having maximum active cases :)
	}

}
