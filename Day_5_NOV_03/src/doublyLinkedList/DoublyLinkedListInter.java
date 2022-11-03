package doublyLinkedList;

public interface DoublyLinkedListInter {
	void addAtFront(int element);
	int deleteAtFront();
	
	void addAtRear(int element);
	int deleteAtRear();
	
	void addAtMiddle(int index, int element);
	int deleteAtMiddle(int index);
	
	int deleteElement(int element);
	int count();
	
	void printList();
}
