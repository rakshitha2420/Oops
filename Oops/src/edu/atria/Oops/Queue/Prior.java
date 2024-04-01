package edu.atria.Oops.Queue;

import java.util.PriorityQueue;

public class Prior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer> que = new PriorityQueue<>();
		
		que.add(2);
		que.offer(3);
		que.add(1);
		que.offer(9);
		System.out.println("Queue Content is"+que);
	}

}
