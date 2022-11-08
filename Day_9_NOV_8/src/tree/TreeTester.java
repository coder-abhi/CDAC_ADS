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
		t.insertOnePointer(10);
		t.insertOnePointer(14);
		t.PrintInorder();
		
		t.deleteAll();
		System.out.println("After Delete");
		t.PrintInorder();
//		System.out.println(t.count);
	}

}
