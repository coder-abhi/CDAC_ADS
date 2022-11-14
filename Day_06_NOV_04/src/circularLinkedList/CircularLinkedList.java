package circularLinkedList;

public class CircularLinkedList implements CircularLinkListInter{
	Node head;
	public CircularLinkedList() {
		head = new Node(-1);
		head.next = head;
	}
	
	@Override
	public void insert(int element) {
		Node newElement = new Node(element);
		
		// if element is empty or have only 1 ele which is head(-1)
		if(head.next == head) {
			head.next = newElement;
			newElement.next = head;
			return;
		}
		/*
		if(head.next == head) {
			head.next = newElement;
			newElement.next = head;
		}*/
		
		Node currNode = head;
		while(currNode.next != head) {
			currNode = currNode.next;
		}
		currNode.next = newElement;
		newElement.next = head;
	}
	
	@Override
	public void print() {
		Node currNode = head.next;
		if(currNode == head) {
			System.out.println("List is empty");
			return;
		}
		
		while(currNode != head) {
			System.out.print(currNode.data+" ");
			currNode = currNode.next;
		}
		System.out.println();
		
	}


	@Override
	public void delete(int element) {
		if(head.next == head) {
			System.out.println("List is already Empty!");
			return ;
		}
		
		Node currNode = head.next;
		Node prev = head;
		while(currNode != head) {
			if(currNode.data == element) {
				prev.next = currNode.next;
				return;
			}
			prev = currNode;
			currNode = currNode.next;
		}
		System.out.println("Element not found!");
		
	}
	
}
