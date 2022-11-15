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
		// if new element is less than first element then we add it at Front
		if(element < head.data ) {
			newElement.next = head;
			head = newElement;
			return;
		}
		
		Node prev = null;
		Node currentNode = head;
		//traversing till end of list && new Element is less than currend data
		while(currentNode != null && currentNode.data <= element) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		
		// adding element before current
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
