package tree;

public class TreeTester {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.createTree();
//		tree.levelOrderPrint();
//		System.out.println("Inorder : ");
		tree.IterativeInOrder();
		
//		System.out.println("\nPre Order : ");
//		tree.root = tree.InversionOfTree(tree.root);
//		tree.IterativeInOrder();
//		tree.levelOrderPrint();
//		System.out.println("Max : "+tree.maxInTree());
//		System.out.println("Min : "+tree.minInTree());
		
//		tree.PrintPostorder();
//		System.out.println("-------------------------");
//		tree.IterativePostOrder();
		System.out.println();
		tree.AdvancePrinting();
	}

}
// 15 10 5 -1 100 -1 -1 -1 77 88 -1 -1 -1
// 15 10 5 -1 100 -1 150 -1 -1 -1 77 88 -1 -1 98 -1 166 -1 -1