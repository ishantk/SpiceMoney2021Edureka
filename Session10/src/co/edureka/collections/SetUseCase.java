package co.edureka.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class User{
	String name;
	int age;
	
	User(){
		
	}
	
	User(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+"\t"+age;
	}
}

class UserComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.age - o2.age;
	}
	
}

public class SetUseCase {

	public static void main(String[] args) {
		
		// Task:
		// Create 2 Sets eg:
		// Set1: kia, sia, mike, lee, harry  -> INPUT1
		// Set2: harry, george, kia, mike	-> INPUT2
		// Set3: kia, mike					-> OUTPUT -> Set of Mutual Friends		
		
		HashSet<String> johnsFriends = new HashSet<String>();
		HashSet<String> fionnasFriends = new HashSet<String>();
		HashSet<String> allFriends = new HashSet<String>();
		
		HashSet<String> mutualFriends = new HashSet<String>();
		
		johnsFriends.add("kia");
		johnsFriends.add("sia");
		johnsFriends.add("mike");
		johnsFriends.add("lee");
		johnsFriends.add("dave");
		
		fionnasFriends.add("harry");
		fionnasFriends.add("george");
		fionnasFriends.add("kia");
		fionnasFriends.add("mike");
		
		Iterator<String> itr1 = johnsFriends.iterator();
		Iterator<String> itr2 = fionnasFriends.iterator();
		
		/*while(itr1.hasNext()) {
			allFriends.add(itr1.next());
		}
		
		while(itr2.hasNext()) {
			allFriends.add(itr2.next());
		}
		
		System.out.println(allFriends);*/
		
		while(itr1.hasNext()) {
			
			String friendName = itr1.next();
			if(fionnasFriends.contains(friendName)) {
				mutualFriends.add(friendName);
			}
			
		}
		
		System.out.println(mutualFriends);
		
		User user1 = new User("John", 20);
		User user2 = new User("Anna", 18);
		User user3 = new User("George", 30);
		
		TreeSet<User> set = new TreeSet<User>(new UserComparator());
		set.add(user1);
		set.add(user2);
		set.add(user3);
		
		System.out.println(set);
		
		
		// We can create the List from Set or Vice Versa and can than use the different methods to write our logic
		// ArrayList<User> users = new ArrayList<User>(set);
		
		

	}

}
