package doublyCircularLinkedList;

public class DoublyCircularTester {

	public static void main(String[] args) {
		DoublyCircularDummy dcd = new DoublyCircularDummy();
//		dcd.addAtFront(5);
//		dcd.addAtFront(15);
//		dcd.addAtFront(25);
//		dcd.addAtFront(17);
		dcd.insert(15);
		dcd.insert(5);
		dcd.insert(55);
		dcd.insert(85);
		
		dcd.insert(25);
		dcd.delete(85);
		
		dcd.Print();
	}

}
