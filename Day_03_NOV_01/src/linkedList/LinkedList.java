package linkedList;


public class LinkedList implements LinkedListInterf {
	Node head;
	Node tail;
	public LinkedList() {
		head = null;
		tail = null;
	}
	@Override
	public void addAtFront(int element) {
		
		Node newNode = new Node(element);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	
	@Override
	public void printLinkedList() {
		
		Node currentNode = head;
		// traversing list till end of list
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}
	@Override
	public void addAtRear(int element) {
		// if list is empty
		if(head == null) {
			addAtFront(element);
			return;
		}
		Node currentNode = head;
		
		// traversing till last element
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		// adding at end of last element
		currentNode.next = new Node(element);
		tail = currentNode.next;
		
	}
	
	@Override
	public void addAtMid(int index, int element) {
		// Checking if index is invalid
		if(index < 0 || index > count()+1) {
			System.out.println("Invalid Index");
			return;
		}
		
		if(index ==1) {
			addAtFront(element);
			return;
		}
		
		Node NewElement = new Node(element);
		Node currentNode = head;
		// traversing till required index
		for(int i=1;i<index-1;i++) {
			currentNode = currentNode.next;
		}
		
		// adding element at our index
		NewElement.next = currentNode.next;
		currentNode.next = NewElement;
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
	
	public void addAtRearUsingTail(int element) {
		if(tail == null) {
			addAtFront(element);
			return;
		}
		tail.next = new Node(element);
		tail = tail.next;
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
	
	@Override
	public int deleteAtRearUsingTail() {
		if(head == null) {
			System.out.println("Linked List is already empty");
			return -1;
		}
		
		// if list have only one element
		if(head.next == null) {
			return deleteAtFront();
		}
		Node prev = head;
		while(prev.next != tail) {
			prev = prev.next;
		}
		
		// adding at end
		int data = tail.data;
		tail = prev;
		tail.next = null;
		return data;
	}
	@Override
	public int deleteAtMid(int index) {
		// checking if index is invalid
		if(index < 1 || index > count()) {
			System.out.println("Invalid index");
			return -1;
		}
		
		if(index == 1) return deleteAtFront();
		
		Node prev = null;
		Node currentNode = head;
		
		// traversing till index
		for(int i=1; i<index; i++) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		// deleting element on index
		int data = currentNode.data;
		prev.next = currentNode.next;
		currentNode = null;
		return data;
	}
	
	@Override
	public int deleteAtRear() {
		if(head == null) {
			System.out.println("Linked List is already empty!");
			return -1;
		}
		// if list have only one element
		if(head.next == null) {
			return deleteAtFront();
		}		
		Node prev = null;
		Node currentNode = head;
		// traversing till end of list
		while(currentNode.next != null) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		// deleting last element
		int data = currentNode.data;
		currentNode = null;
		prev.next = null;
		
		return data;
	}

			
}
