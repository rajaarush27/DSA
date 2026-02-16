package com.cb.linkedlist;

public class SinglyLinkedListClient {
	public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(10);
        sll.addFirst(20);
        sll.addLast(30);
        sll.display();
        System.out.println();
        sll.addAtIndex(40, 2);
        sll.display();
	}
}
