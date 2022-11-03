package linkedList;

import java.util.Scanner;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtRear(15);
		list.addAtRear(45);
		list.addAtRear(55);
		list.addAtRear(565);
		
		list.printLinkedList();
//		System.out.println("\nDeleted ele : "+list.deleteAtFront());
//		list.printLinkedList();
//		System.out.println("\nDeleted ele : "+list.deleteAtRearUsingTail());
//		list.printLinkedList();
		
		Scanner sc = new Scanner(System.in);
		int index = -1;
		System.out.print("\nWhich index you want to Delete ? ");

		while((index = sc.nextInt()) != -1) {
			list.addAtMid(index, 8888);
			list.printLinkedList();
			System.out.print("\nWhich index you want to Delete ? ");
		}
	}

}
