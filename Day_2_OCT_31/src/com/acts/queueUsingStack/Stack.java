package com.acts.queueUsingStack;

public class Stack implements StackInterface {
	int stackArray[];
	public int top ;
	int size;
	
	// Constructor
	Stack(int length){
		this.size = length;
		this.stackArray = new int[length];
		this.top = -1;
	}
	
	@Override
	public boolean isEmpty() {
		if(top == -1) return true;
		return false;
	}
	
	@Override
	public boolean isFull() {
		if(top == this.size-1) return true;
		return false;
	}
	
	@Override
	public void push(int element) {
		if(!isFull()) {
			stackArray[++this.top] = element;
		}
		else System.out.println("Stack is Already Full!!");
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			return stackArray[this.top--];
		}
		else System.out.println("Stack is Already Empty!!");
		return -1;
	}
}
