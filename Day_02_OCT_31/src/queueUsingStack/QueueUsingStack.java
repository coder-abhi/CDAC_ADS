package queueUsingStack;

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

	// we are creating delete costly Queue using stack
	@Override
	public int deleteQ() {
		if(!isEmpty()) {
			// coping all the elements from our stack to temporary stack
			copy(stackMain,stackTemp);
			
			// poping last element of temporary stack
			int resultEle = stackTemp.pop();
			
			// geting back all the remaining elements from temp stack to main stack
			copy(stackTemp,stackMain);			
			return resultEle;
		}
		else {
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
