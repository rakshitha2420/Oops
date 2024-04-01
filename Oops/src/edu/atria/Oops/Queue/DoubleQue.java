package edu.atria.Oops.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DoubleQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> que = new LinkedList<>();
		
		que.add(2);
		que.offer(3);
		que.add(1);
		que.offer(9);
		
		
		que.addFirst(10);
		que.addLast(24);
		
		System.out.println("Queue Content is :"+que);
		System.out.println("Queue Content(get First) is :"+que.getFirst());
		System.out.println("Queue Content is(get Last) :"+que.getLast());
	}

}
