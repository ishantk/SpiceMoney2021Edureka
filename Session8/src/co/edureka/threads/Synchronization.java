package co.edureka.threads;

class MovieTicket{
	
	String movieName;
	int seatNumber;
	String userEmail;
	boolean isBooked;
	
	MovieTicket(){
		
	}
	
	MovieTicket(String movieName, int seatNumber){
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		userEmail = "";
		isBooked = false;
	}
	
	void showMovieTicket() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(movieName+" ["+seatNumber+"]");
		System.out.println("User: "+userEmail);
		System.out.println("Booked: "+isBooked);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	}
	
}

class User{
	
	String name;
	String email;
	boolean isPrimeUser;
	MovieTicket ticket;
	
	User(){
		
	}

	User(String name, String email, boolean isPrimeUser) {
		this.name = name;
		this.email = email;
		this.isPrimeUser = isPrimeUser;
	}
	
	void showUser() {
		System.out.println(name+" "+email);
	}
	
	void selectMovieTicket(MovieTicket ticket){
		this.ticket = ticket;
	}
	
}

class Transaction{
	
	void makePayment(String name) {
		System.out.println(name+" - Transacting Amount...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" - Thank you for your Payment");
	}
	
}


class BookTicketTask extends Thread{
	
	
	User user; // Which user is going to book the ticket
	
	BookTicketTask(User user){
		this.user = user;
	}
	
	public void run() {
		
		// we are now going to lock user.ticket
		// which means till time synchronized block will not be finished
		// no other thread can execute the run method 
		synchronized (user.ticket) {
			
			// If user is not a prime user
			// User should be made to wait to perform any operation on the ticket object
			if(!user.isPrimeUser) {
				try {
					user.ticket.wait(); // thread will now wait and will be blocked
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			if(!user.ticket.isBooked) {
				// 2. Make the Payment
				Transaction transaction = new Transaction();
				transaction.makePayment(user.name);
				
				// Update the Ticket Object State for the User after transaction
				user.ticket.userEmail = user.email;
				user.ticket.isBooked = true;
				
				// 3. Send Acknowledgement for Booked Ticket to User
				System.out.println(user.name + " - Thank You Your Ticket is Booked");
				
				// Notify any thread waiting on the same ticket object to resume operations
				user.ticket.notify();
				
			}else {
				System.out.println(user.name + " - Sorry The Ticket is already booked");
			}
		}
		
	}
	
}

public class Synchronization {

	public static void main(String[] args) {
		
		// Movie Ticket Array
		//MovieTicket[][] cinemaHall = new MovieTicket[10][10];
		
		// For simplicity to understand lets have a single row
		MovieTicket[] rowA = new MovieTicket[10];
		
		for(int i=0;i<rowA.length;i++) {
			rowA[i] = new MovieTicket("Avengers", (i+1));
		}
		
		for(MovieTicket ticket: rowA) {
			ticket.showMovieTicket();
		}
		
		User user1 = new User("John", "john@example.com", false);
		User user2 = new User("Fionna", "fionna@example.com", true);
		
		// Multiple Threads working on the Same Object -> Challenge in MultiThreading
		
		// 1. Select the Seat
		user1.selectMovieTicket(rowA[1]);
		
		// 1. Select the Seat
		user2.selectMovieTicket(rowA[1]);
		
		BookTicketTask task1 = new BookTicketTask(user1);
		BookTicketTask task2 = new BookTicketTask(user2);
		
		task1.start();
		task2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(MovieTicket ticket: rowA) {
			ticket.showMovieTicket();
		}
		
	}

}
