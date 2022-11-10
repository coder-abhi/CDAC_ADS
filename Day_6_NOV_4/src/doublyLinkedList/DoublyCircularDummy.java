package doublyLinkedList;

public class DoublyCircularDummy {
	Node head;
	public DoublyCircularDummy() {
		head = new Node(-1);
		head.prev = head;
		head.next = head;
	}
	
	public void insert(int element) {
		
		Node newNode = new Node(element);
		Node curr = head.next;
		
		while(element > curr.data && curr != head) {
			curr = curr.next;
		}
		
		newNode.next = curr;
		newNode.prev = curr.prev;
		
		curr.prev.next = newNode;
		curr.prev = newNode;
	}
	
	
	public void addAtFront(int element) {
		Node newNode = new Node(element);
		
		if(head.next == head) {
			head.prev = newNode;
			head.next = newNode;
			newNode.next = head;
			newNode.prev = head;
			return;
		}
		
//		newNode.next = curr;
//		newNode.prev = curr.prev;
//		
//		curr.prev.next = newNode;
//		curr.prev = newNode;
		
		head.next.prev = newNode;
		newNode.next = head.next;
		head.next = newNode;
		newNode.prev = head;
		
	}
	
	public void delete(int element) {
		if(head.next == head) {
			return;
		}
		
		Node curr = head.next;
		while(curr != head) {
			if(curr.data == element) {
				curr.next.prev = curr.prev;
				curr.prev.next = curr.next;
				return;
			}
			curr = curr.next;
		}
	}
	
	public void Print() {
		Node curr =  head.next;
		while(curr != head) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	
}
