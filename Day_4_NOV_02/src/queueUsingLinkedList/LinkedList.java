package queueUsingLinkedList;


public class LinkedList implements LinkedListInterf {
	Node head;
	Node tail;
	public LinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void addAtRear(int element) {
		if(head == null) {
			head = new Node(element);
			return;
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(element);
		tail = currentNode.next;
		
	}

	@Override
	public int deleteAtFront() {
		if(head == null) {
			System.out.println("Linked List is already empty");
			return -1;
		}
		int data;
		if(count() == 1) {
			data = head.data;
			head = tail = null;
			return data;
		}
		
		data = head.data;
		head = head.next	;
		return data;
	}

			
}
