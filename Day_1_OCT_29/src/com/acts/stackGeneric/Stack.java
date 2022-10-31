package com.acts.stackGeneric;

public class Stack<T> implements StackInterface<T> {
	T stackArray[];
	public int top ;
	int size;
	
	// Constructor
	@SuppressWarnings("unchecked")
	Stack(int length){
		this.size = length;
		this.stackArray = (T[]) new Object[length];
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
	public void push(T element) {
		if(!isFull()) {
			stackArray[++this.top] = element;
		}
		else System.out.println("Stack is Already Full!!");
	}

	@Override
	public T pop() {
		if(!isEmpty()) {
			return stackArray[this.top--];
		}
		else System.out.println("Stack is Already Empty!!");
		return null;
	}
}
