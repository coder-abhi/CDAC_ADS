package queue;

public class Queue implements QueueInterface {

	int queueArray[];
	int capacity;
	int front;
	int rear;

	Queue(int length){
		this.capacity = length;
		this.queueArray = new int[length];
		front = 0;
		rear = 0;
	}

	@Override
	public boolean isFull() {
		if(rear == this.capacity)  return true;
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
			this.queueArray[rear++] = element;
		}
		else System.out.println("Queue is already Full");
	}

	@Override
	public int deleteQ() {
		if(!isEmpty()) {
			int deleteEle = queueArray[front];
			
			// Shifting all elements after deleting Q
			for(int i = front ; i<rear-1 ; i++) {
				this.queueArray[i] = this.queueArray[i+1];
			}
			rear--;
			return deleteEle;
		}else System.out.println("Queue is already empty");
		
		return -1;
	}

}
