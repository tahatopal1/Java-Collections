package section9_queue.section34_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApplication {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(4);
		queue.add(2);
		queue.add(5);
		queue.add(1);
		queue.add(15);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		Queue<String> queue2 = new PriorityQueue<String>();
		queue2.add("John");
		queue2.add("Jack");
		queue2.add("Jose");
		System.out.println(queue2);
		
	}

}
