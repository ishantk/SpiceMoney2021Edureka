
public class NesetedLoops {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			System.out.println("i is: "+i);
			//System.out.println("Awesome");
			for(int j=1;j<=5;j++) {
				//System.out.println(">> j is: "+j);
				System.out.print(j+" ");
			}
			System.out.println("~~~~~~~~~~~~");
		}
		
		/*
		 
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		  
		 */
		
		System.out.println();
		 
		for(int i=1; i<=8; i++) {
			for(int j=1;j<=8;j++) {
				if(i%2==0) {
				   System.out.print((j+1)%2+" ");
				}else {
				   System.out.print(j%2+" ");
				}
		   }
		   System.out.println("");
	   }

	}

}
