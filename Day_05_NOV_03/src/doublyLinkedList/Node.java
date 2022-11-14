package doublyLinkedList;

public class Node {
	Node prev;
	int data;
	Node next;
	public Node(int element) {
		prev = next = null;
		this.data = element;
	}
}
