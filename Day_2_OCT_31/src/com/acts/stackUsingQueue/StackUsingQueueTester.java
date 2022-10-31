package com.acts.stackUsingQueue;

public class StackUsingQueueTester {

	public static void main(String[] args) {
		StackUsingQueue stack = new StackUsingQueue(5);
		stack.push(15);
		stack.push(35);
//		stack.push(65);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.pop());
	}

}
