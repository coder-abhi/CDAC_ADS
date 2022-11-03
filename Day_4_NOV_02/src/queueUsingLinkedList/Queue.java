package queueUsingLinkedList;

public class Queue implements QueueInterface {

	LinkedList list;
	int front;
	int rear;

	Queue(int length){
		list = new LinkedList();
		front = -1;
		rear = -1;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(this.list.head == null) return true;
		return false;
	}

	@Override
	public void addQ(int element) {

		list.addAtRear(element);
	}

	@Override
	public int deleteQ() {
		if(!isEmpty()) {
			return list.deleteAtFront();
		}else System.out.println("Queue is already empty");
		
		return 0;
	}

}
