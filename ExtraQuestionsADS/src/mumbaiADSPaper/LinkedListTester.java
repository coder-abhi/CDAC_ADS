package mumbaiADSPaper;

import java.util.HashSet;
import java.util.Set;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtRear(13);
		list.addAtRear(22);
		list.addAtRear(35);
		list.addAtRear(35);
		list.addAtRear(47);
		
		list.removeDuplicate();
		list.printLinkedList();
	}

}
