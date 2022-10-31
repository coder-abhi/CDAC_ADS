package com.acts.queueUsingStack;

public class QueueUsingStackTester {

	public static void main(String[] args) {
		QueueUsingStack queue = new QueueUsingStack(5);
		queue.addQ(12);
		queue.addQ(22);
		queue.addQ(22);
		queue.addQ(32);
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
	}

}
