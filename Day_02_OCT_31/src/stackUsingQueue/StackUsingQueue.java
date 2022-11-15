package stackUsingQueue;

public class StackUsingQueue implements StackInterface {
	Queue queueMain;
	Queue queueTemp;
	public int top ;
	int size;
	
	// Constructor
	StackUsingQueue(int length){
		this.size = length;
		queueMain = new Queue(length);
		queueTemp = new Queue(length);
		this.top = -1;
	}
	
	@Override
	public boolean isEmpty() {
		return queueMain.isEmpty();
	}
	
	@Override
	public boolean isFull() {
		return queueMain.isFull();
	}
	
	// we are creating push costly stack using queue
	@Override
	public void push(int element) {
		if(!isFull()) {
			// coping main queue to temporary queue
			copy(queueMain,queueTemp);
			
			// adding element in main queue
			queueMain.addQ(element);
			
			// getting back temp queue to main queue 
			copy(queueTemp,queueMain);
		}
		else System.out.println("Stack is Already Full!!");
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			int resultEle = this.queueMain.deleteQ();
			return resultEle;
		}
		else System.out.println("Stack is Already Empty!!");
		return -1;
	}

	private void copy(Queue q1, Queue q2) {
		while(!q1.isEmpty()) {
			q2.addQ(q1.deleteQ());
			q2.clear();
		}
	}
	
}
