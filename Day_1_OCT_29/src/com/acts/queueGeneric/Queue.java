package com.acts.queueGeneric;

public class Queue <T> implements QueueInterface {

	T queueArray[];
	int front;
	int rear;

	Queue(int length){
		this.queueArray = (T[]) new Object[length];
		front = -1;
		rear = -1;
	}

	@Override
	public boolean isFull() {
		if(rear == queueArray.length-1)  return true;
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(rear == front) return true;
		return false;
	}
	

	@Override
	public T deleteQ() {
		if(!isEmpty()) {
			return queueArray[++front];
		}else System.out.println("Queue is already empty");
		
		return null;
	}

	@Override
	public void addQ(Object element) {
		//
		if(!isFull()) {
			this.queueArray[++rear] = (T)element;
		}
		else System.out.println("Queue is already Full");
		
	}


}
