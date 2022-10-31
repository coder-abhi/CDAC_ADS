package com.acts.queueUsingStack;

public class QueueUsingStack implements QueueInterface {

	Stack stackMain;
	Stack stackTemp;
	int front;
	int rear;

	QueueUsingStack(int length){
		stackMain = new Stack(length);
		stackTemp = new Stack(length);
		front = -1;
		rear = -1;
	}

	@Override
	public boolean isFull() {
		return stackMain.isFull();
	}

	@Override
	public boolean isEmpty() {
		return stackMain.isEmpty();
	}

	@Override
	public void addQ(int element) {

		if(!isFull()) {
			this.stackMain.push(element);
		}
		else System.out.println("Queue is already Full");
	}

	@Override
	public int deleteQ() {
		if(!isEmpty()) {
			copy(stackMain,stackTemp);
			int resultEle = stackTemp.pop();
			copy(stackTemp,stackMain);			
			return resultEle;
		}else {
			System.out.println("Queue is already Empty!!");
			return -1;
		}
	}
	
	private void copy(Stack st1, Stack st2) {
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
		}
	}

}
