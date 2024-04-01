package edu.atria.Oops.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		// we cant create an object for Queue because queue is an interface
		Queue<Integer> que = new LinkedList<>();
		
		que.add(2);
		que.offer(3);
		que.add(1);
		que.offer(9);
		System.out.println("Queue content is :"+que);
		que.clear();
		System.out.println("Queue content is(using remove) :"+que.remove());
		System.out.println("Queue content is :"+que);
		//que.clear();
		System.out.println("Queue content is :"+que.peek());
		System.out.println("Queue updated content is :"+que);
		//que.clear();
		System.out.println("Queue content is :"+que.poll());
		System.out.println("Queue updated content is :"+que);
	}

}
