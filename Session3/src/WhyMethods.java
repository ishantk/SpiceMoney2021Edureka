
public class WhyMethods {
	
	// Write your solution as a method to reuse it multiple times :)
	static int getMax(int[] array) {
		
		int max = array[0];
		
		for(int idx=1; idx<array.length; idx++) {
			if(array[idx] > max) {
				max = array[idx];
			}
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		
		int[] productPrices = {9000, 3600, 8000, 17500, 3200};
		int[] covidCases = {65232, 1311, 13455, 53422, 134556};
		int[] scores = {67, 55, 89, 12, 88, 99, 65};
		
		/*int max = productPrices[0]; // max -> 9000
		
		for(int idx=1; idx<productPrices.length; idx++) {
			if(productPrices[idx] > max) {
				max = productPrices[idx];
			}
		}
		
		System.out.println("Max is: "+max);
		
		max = covidCases[0];
		
		for(int idx=1; idx<covidCases.length; idx++) {
			if(covidCases[idx] > max) {
				max = covidCases[idx];
			}
		}
		
		System.out.println("Max is: "+max);
		
		max = scores[0];
		
		for(int idx=1; idx<scores.length; idx++) {
			if(scores[idx] > max) {
				max = scores[idx];
			}
		}
		
		System.out.println("Max is: "+max);*/
		
		System.out.println("Max in Product Prices is: "+getMax(productPrices));
		System.out.println("Max in Covid Cases is: "+getMax(covidCases));
		System.out.println("Max in Scores is: "+getMax(scores));
		

	}

}
