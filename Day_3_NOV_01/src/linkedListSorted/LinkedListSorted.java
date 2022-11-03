package linkedListSorted;


public class LinkedListSorted implements LinkedListInterf{
	Node head;
	
	public LinkedListSorted() {
		head = null;
	}
	@Override
	public void add(int element) {
		Node newElement = new Node(element);
		
		// if list is empty - we will directly add element
		if(head == null) {
			head = newElement;
			return;
		}
		if(element < head.data ) {
			newElement.next = head;
			head = newElement;
			return;
		}
		
		Node prev = null;
		Node currentNode = head;
		while(currentNode != null && currentNode.data <= element) {
//			System.out.println("data : "+currentNode.data);
			prev = currentNode;
			currentNode = currentNode.next;
		}
		newElement.next = currentNode;
		prev.next = newElement;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printLinkedList() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}		
	}

}
