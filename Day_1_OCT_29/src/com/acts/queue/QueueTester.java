package com.acts.queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.addQ(15);
		queue.addQ(25);
		queue.addQ(15);
		queue.addQ(88);
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
	}

}
