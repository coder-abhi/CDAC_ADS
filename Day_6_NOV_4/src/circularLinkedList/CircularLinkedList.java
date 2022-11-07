package circularLinkedList;

public class CircularLinkedList implements CircularLinkListInter{
	Node head;
	public CircularLinkedList() {
		head = null;
	}
	
	@Override
	public void insert(int element) {
		Node newElement = new Node(element);
		
		if(head == null) {
			head = newElement;
			head.next = head;
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
		Node currNode = head;
		if(head == null) {
			System.out.println("List is empty");
			
		}
		
		while(currNode != head) {
			System.out.print(currNode.data+" ");
			currNode = currNode.next;
		}
		System.out.println();
		
	}


	@Override
	public void delete(int element) {
		if(head == null) {
			System.out.println("List is already Empty!");
			return ;
		}
		
		//if list has only one element
		if(head.next == head) {
			if(head.data == element) {
				head = null;
			}
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
	}
	
}
