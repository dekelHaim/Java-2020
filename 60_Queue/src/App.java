import java.util.*;

public class App {

	public static void main(String[] args) {
		
		// Queue is FIFO = First In First Out
		Queue<String> queue=new PriorityQueue<String>();  
		
		queue.add("a");
		queue.add("b");
		queue.add("c");
		
		System.out.println(queue.peek());  //--> a
		System.out.println(queue);  //--> [a, b, c]
		
		
		String poll=queue.poll();
		System.out.println(poll);   //--> a
		System.out.println(queue);  //--> [b, c]

	
		
		
	}

}
