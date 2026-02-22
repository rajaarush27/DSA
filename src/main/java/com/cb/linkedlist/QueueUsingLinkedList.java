package com.cb.linkedlist;

import java.util.LinkedList;

public class QueueUsingLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> q = new LinkedList<>();
        q.add(10); // Add Last
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
       System.out.println(q.remove()); // remove first   
       System.out.println(q.poll()); // remove first   
       System.out.println(q.peek()); // remove first   
	}
	
}
