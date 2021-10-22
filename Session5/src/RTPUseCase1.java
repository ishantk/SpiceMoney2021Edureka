class YoutubeChannel{
	
	String channelName;
	Notification notification; // Just a Reference variable of Notification
	
	YoutubeChannel(){
		
	}
	
	YoutubeChannel(String channelName){
		this.channelName = channelName;
		System.out.println("[YoutubeChannel] Welcome to the Channel: "+channelName);
	}
	
	
	// We should be able to notify the User whenever we upload a new Video
	void subscribe(User user) {
		notification = user; // Polymorhic statement
		// Reference variable of the Parent Notification refers to the Child 
	}
	
	void uploadVideo(String videoName) {
		System.out.println("[YoutubeChannel] Video Uploaded Successfully: "+videoName);
		notification.notifyMessage("A New Video Available: "+videoName);
	}
	
}

class Notification{
	
	void notifyMessage(String message) {
		System.out.println("A new notification received");
		System.out.println("Message: "+message);
	}
	
}

class User extends Notification{
	
	String email;
	
	User(){
		
	}
	
	User(String email){
		this.email = email;
	}
	
	void notifyMessage(String message) {
		System.out.println("~~~~~~~~~~~~~~~User~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Hello, A new Notification Received.");
		System.out.println("Message: "+message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}


public class RTPUseCase1 {

	public static void main(String[] args) {
		
		YoutubeChannel channel = new YoutubeChannel("edureka");
		User user1 = new User("john@gmail.com");
		
		channel.subscribe(user1);
		
		channel.uploadVideo("Java Interview Q&A By Ishant");

	}

}
