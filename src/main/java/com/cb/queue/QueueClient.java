package com.cb.queue;

public class QueueClient {
	public static void main(String[] args) {
		Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        
        System.out.println(queue.getFront());
        queue.display();
	}

}
