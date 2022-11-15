package avlTree;

public class AVLTester {

	public static void main(String[] args) {
		AVL avl = new AVL();
//		avl.insert(40);
//		avl.insert(50);
//		avl.insert(20);
//		avl.insert(18);
//		avl.insert(22);
//		avl.insert(25);
		
		avl.insert(40);
		avl.insert(30);
		avl.insert(50);
		avl.insert(48);
		avl.insert(60);
		avl.insert(47);
		avl.insert(49);
		
//		avl.delete(48);
		avl.delete(40);
//		System.out.println("Height of tree : "+avl.balanceFactor(avl.root));
//		System.out.println("Height of tree : "+avl.balanceFactor(avl.root));
//		System.out.println("Height of tree : "+avl.balanceFactor(avl.root));
		
//		avl.levelOrderPrint();
		avl.AdvancePrinting();
	}

}
