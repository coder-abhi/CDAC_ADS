package doublyLinkedList;

public class DoublyLinkedListTester {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addAtFront(15);
		list.addAtFront(25);
		list.addAtFront(35);
		
		list.addAtRear(88);
		list.addAtRear(99);
		
		list.printList();
//		System.out.println("\nDeleed at Front Eleent : "+list.deleteAtFront());
//		System.out.println("\nDeleed at Front Eleent : "+list.deleteAtFront());
		
		System.out.println();
		list.addAtMiddle(7, 155);
		list.printList();
		
	}

}
