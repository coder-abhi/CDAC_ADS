package linkedList;

public interface LinkedListInterf {
	void addAtFront(int element);
	void addAtRear(int element);
	void addAtMid(int index, int element);
	int deleteAtFront();
	int deleteAtRear();
	int count();
	int deleteAtMid(int index);
	void printLinkedList();
	int deleteAtRearUsingTail();
}
