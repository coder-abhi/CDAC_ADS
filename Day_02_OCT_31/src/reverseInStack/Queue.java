package reverseInStack;

public class Queue implements QueueInterface {

	int queueArray[];
	int front;
	int rear;

	Queue(int length){
		this.queueArray = new int[length];
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
	public void addQ(int element) {

		if(!isFull()) {
			this.queueArray[++rear] = element;
		}
		else System.out.println("Queue is already Full");
	}

	@Override
	public int deleteQ() {
		if(!isEmpty()) {
			return queueArray[++front];
		}else System.out.println("Queue is already empty");
		
		return 0;
	}

}
