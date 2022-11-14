package circularLinkedList;

public class CircularListTester {

	public static void main(String[] args) {
		CircularLinkedList CLL = new CircularLinkedList();
		CLL.insert(15);
		CLL.insert(25);
		CLL.insert(33);
//		CLL.delete(25);
//		CLL.delete(15);
		CLL.delete(15);
		CLL.print();
	}

}
