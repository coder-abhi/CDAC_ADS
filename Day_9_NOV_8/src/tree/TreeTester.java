package tree;

public class TreeTester {

	public static void main(String[] args) {
		Tree t = new Tree();
//		t.insertTwoPointer(9);
//		t.insertTwoPointer(3);
//		t.insertTwoPointer(1);
//		t.insertTwoPointer(10);
//		t.insertTwoPointer(13);
		
		t.insertOnePointer(9);
		t.insertOnePointer(3);
		t.insertOnePointer(1);
		t.insertOnePointer(13);
		t.insertOnePointer(12);
		t.insertOnePointer(11);
		t.insertOnePointer(15);
//		t.PrintInorder();
//		
//		t.deleteAll();
		
		t.delete(13);
		System.out.println("After Delete");
		t.PrintInorder();
		System.out.println("\nHeight : "+t.height());
	}

}
