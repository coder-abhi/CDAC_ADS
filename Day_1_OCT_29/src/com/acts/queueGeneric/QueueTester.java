package com.acts.queueGeneric;

public class QueueTester {

	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>(5);
		queue.addQ("Hello");
		queue.addQ("Mr ...");
		queue.addQ("Howwww");
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
		System.out.println(queue.deleteQ());
	}

}
