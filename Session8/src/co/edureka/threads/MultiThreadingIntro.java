package co.edureka.threads;


/*class PrintingTask{
	
	void printDocument(String document, int copies) {
		for(int i=1;i<=copies;i++) {
			System.out.println("[Printing Task] Printing "+document+" copy#"+i);
			
			try {
				Thread.sleep(1000); // delay in program for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
	}
	
}*/

// To make your class a Thread simply extends it from Thread Class
// Thread executes the run method in it so we need to override the same
class PrintingTask extends Thread{
	
	String document;
	int copies;
	
	PrintingTask(){
		
	}
	
	PrintingTask(String document, int copies){
		this.document = document;
		this.copies = copies;
	}
	
	public void run() {
		for(int i=1;i<=copies;i++) {
			System.out.println("[Printing Task] Printing "+document+" copy#"+i);
			
			try {
				Thread.sleep(1000); // delay in program for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	
}

class Printer{
	
	String document;
	int copies;
	
	Printer(){
		
	}
	
	Printer(String document, int copies){
		this.document = document;
		this.copies = copies;
	}
	
	
}

//class MyPrinitngTask extends Printer, Thread{ -> We cannot inherit from Thread now :(
class MyPrinitngTask extends Printer implements Runnable{

	MyPrinitngTask(){
		
	}
	
	MyPrinitngTask(String document, int copies){
		super(document, copies);
	}
	
	public void run() {
		for(int i=1;i<=copies;i++) {
			System.out.println("[MyPrinitngTask] Printing "+document+" copy#"+i);
			
			try {
				Thread.sleep(1000); // delay in program for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			if(i==5) {
				throw new ArithmeticException("Something Went Wrong");
			}
		}
	}
	
}

public class MultiThreadingIntro {

	// when we execute our program
	// whatever we write in main gets executed
	public static void main(String[] args) {
		System.out.println("[MAIN] App Started");
		
		PrintingTask task = new PrintingTask("LearningJava.pdf", 10); // This time we got the object of the Thread :)
		//task.printDocument("LearningJava.pdf", 10);
		
		// Polymorphic Statement
		Runnable ref = new MyPrinitngTask("LearningC++.pdf", 10);
		Thread thread = new Thread(ref);
		
		task.setName("Charlie");
		//task.setPriority(Thread.MIN_PRIORITY);	// 1
		//task.setPriority(Thread.NORM_PRIORITY); 	// 5
		//task.setPriority(Thread.MAX_PRIORITY);  	// 10
		
		System.out.println("Name of PrintingTask: "+task.getName());
		System.out.println("Name of MyPrinitngTask: "+thread.getName());
		System.out.println("Name of main: "+Thread.currentThread().getName());
		
		System.out.println("Priority of PrintingTask: "+task.getPriority());
		System.out.println("Priority of MyPrinitngTask: "+thread.getPriority());
		System.out.println("Priority of main: "+Thread.currentThread().getPriority());
		
		task.start(); // execute the start method of Thread, which internally executes the run method
		System.out.println("State1 of PrintingTask is: "+task.getState());
		System.out.println("State1 of MyPrinitngTask is: "+thread.getState());
		try {
			// Let my tasks get executed first and all other threads should wait
			task.join(); // executed the join on task immediately after the start
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("State2 of PrintingTask is: "+task.getState());
		
		thread.start();
		
		
		for(int i=1;i<=10;i++) {
			System.out.println("[MAIN] Printing LearningPython copy#"+i);
			
			try {
				Thread.sleep(1000); // delay in program for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
		
		
		System.out.println("[MAIN] App Ended");
	}

}
