
public class Loops {

	public static void main(String[] args) {
		
		/*
		 	John and Jack creates a wall of bricks
		 	John places bricks in a sequence from 1 with an increment of 1 as well
		 	Jack simply doubles the bricks to be placed in wall as of John
		 	
		 	john -> 1		2		3
		 	jack -> 1*2     2*2		3*2
		 	
		 	client -> 13 bricks
		 */
		
		int totalBricks = 13;
		
		int placedBricks = 0;
		
		for(int john=1; john<=totalBricks; john++) {
			
			
			System.out.println("John has Placed the Brick: "+john);
			placedBricks += john;
			System.out.println("Jack has Placed the Brick: "+john*2);
			placedBricks += john*2;
			System.out.println("TOTAL BRICKS PLACED: "+placedBricks);
			System.out.println();
			
			if(placedBricks > totalBricks) {
				break; // terminate the loop
			}
		}

		
		for(int i=1;i<=10;i++) {
			
			if(i<5) {
				continue;
			}
			
			System.out.println("i is: "+i);
		}
	}

}
