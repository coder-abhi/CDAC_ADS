package doublyLinkedList;


public class DoublyLinkedList implements DoublyLinkedListInter{
	Node head;
	Node tail;
	public DoublyLinkedList() {
		head = tail = null;
	}
	
	@Override
	 public void addAtFront(int element) {
		Node newNode = new Node(element);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = head.prev;
		
	}
	
	@Override
	public int deleteAtFront() {
		if(head == null) {
			System.out.println("List is already empty");
			return -1;
		}
		
		int data;
		if(head.next == null) {
			data = head.data;
			head = null;
			tail = null;
			return data;
		}
		data = head.data;
		head = head.next;
		head.prev = null;
		return data;
	}

	@Override
	public void addAtRear(int element) {
		Node newNode = new Node(element);
		if(head == null) {
			head = tail = newNode;
			tail = head;
			return;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = tail.next;
	}

	@Override
	public int deleteAtRear() {
		if(head == null) {
			System.out.println("List is already empty");
			return -1;
		}
		int data;
		data = tail.data;
		if(tail == null) {
			head = null;
			return data;
		}
		
		tail = tail.prev;
		return data;
	}

	@Override
	public void addAtMiddle(int index, int element) {
		if(index < 1 || index > count()+1) {
			System.out.println("Invalid Index");
			return;
		}
		
		Node newNode = new Node(element);
		
		if(index == 1) {
			addAtFront(element);
			return;
		}
		Node currentNode = head;
		Node prev = null;
		for(int i = 1; i<index; i++) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		
		if(currentNode == null) {
			addAtRear(element);
			return;
		}
		newNode.next = currentNode;
		newNode.prev = prev;
		prev.next = newNode;
		currentNode.prev = newNode;
		
		return;
		
		/*
		 * Using 1 pointer
		newNode.next = currentNode;
		currentNode = currentNode.prev;
		newNode.prev = currentNode;
		currentNode.next = newNode;
		newNode.next.prev = newNode;
		*/
	}

	@Override
	public int deleteAtMiddle(int index) {
		if(index < 0 || index > count()+1) {
			System.out.println("Invalid index");
			return -1;
		}
		if(index == 1) return deleteAtFront();
		if(index == count()) return deleteAtRear();
		
		Node currentNode = head;
		int data;
		
		for(int i = 1; i<index; i++) {
			currentNode = currentNode.next;
		}
		data = currentNode.data;
		currentNode.prev.next = currentNode.next;
		currentNode.next.prev = currentNode.prev;
		return data;
	}

	@Override
	public int deleteElement(int element) {
		Node currentNode = head;
		while(currentNode != null) {
			if(currentNode.data == element) {
				if(currentNode == head) return deleteAtFront();
				if(currentNode == tail) return deleteAtRear();
				
				currentNode.prev.next = currentNode.next;
				currentNode.next.prev = currentNode.prev;
			}
			currentNode = currentNode.next;
		}
		return 0;
	}

	@Override
	public int count() {
		int count = 0;
		Node currentNode = head;
		while(currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}

	@Override
	public void printList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}		
	}
}
