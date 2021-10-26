package co.edureka.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		// Data is added as: (Head) 10 9 8 7 6 5 4 3 2 1 (Tail)
		// PriorityQueue will sort the data automatically
		// Hence, Queue now is: (Head) 1 2 3 4 5 6 7 8 9 10 (Tail) :)
		
		/*int head = queue.peek(); // read the head of Queue
		System.out.println("Head is: "+head);
		System.out.println("Size is: "+queue.size());
		
		// Remove the head
		queue.poll(); // remove the head of queue -> FIFO :)
		
		head = queue.peek();
		System.out.println("Head now is: "+head);
		System.out.println("Size now is: "+queue.size());*/
		
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.peek()); // Print/Read Head
			queue.poll(); // Remove Head
		}
			
		

	}

}
