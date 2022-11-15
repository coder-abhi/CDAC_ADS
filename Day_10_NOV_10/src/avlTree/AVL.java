package avlTree;

import java.util.LinkedList;
import java.util.Queue;


public class AVL {
	Node root;
	public AVL() {
		root = null;
	}

	public int height(Node root) {
		if(root == null)return 0;
		return 1 + Math.max(height(root.left), height( root.right));
	}

	public int balanceFactor(Node root) {
		return height(root.left) - height(root.right);
	}

	public Node LLRotation(Node current) {
		System.out.println("IN LL rotation");
		Node currLeft = current.left;
		Node currLeftRight = currLeft.right;

		currLeft.right = current;
		current.left = currLeftRight;

		if(root == current) root = currLeft;
		return currLeft;

	}
	public Node RRRotation(Node current) {

		Node currRight = current.right;
		Node currRightLeft = currRight.left;

		currRight.left = current;
		current.right = currRightLeft;

		if(root == current) root = currRight;
		return currRight;
	}

	public Node LRRotation(Node current) {

		Node pointer = current.left;

		Node pointerRight = pointer.right;

		pointer.right = pointerRight.left;
		current.left = pointerRight.right;

		pointerRight.right = current;
		pointerRight.left = pointer;

		if(root == current) root = pointerRight;
		return pointerRight;

	}
	public Node RLRotation(Node current) {

		Node pointer = current.right;

		Node pointerLeft = pointer.left;

		pointer.left = pointerLeft.right;
		current.right = pointerLeft.left;

		pointerLeft.left = current;
		pointerLeft.right = pointer;

		if(root == current) root = pointerLeft;
		return pointerLeft;

	}

	public Node insertElement(Node root, int ele) {
		if(root == null) return root = new Node(ele);
		if(ele < root.data) root.left = insertElement(root.left, ele);
		else root.right = insertElement(root.right, ele);

		//		System.out.println("Balance Root : "+balanceFactor(root) + " root .left : "+balanceFactor(root.left));

		if(balanceFactor(root)==2 && balanceFactor(root.left)==1) return LLRotation(root);
		else if(balanceFactor(root)==-2 && balanceFactor(root.right)==-1) return RRRotation(root);
		else if(balanceFactor(root)==2 && balanceFactor(root.left)==-1) return LRRotation(root);
		else if(balanceFactor(root)==-2 && balanceFactor(root.right)==1) return RLRotation(root);

		return root;
	}

	public void insert(int ele) {
		this.root = insertElement(root, ele);
	}

	public Node inorderSuc(Node root) {
		Node curr = root.right;

		if(curr != null ) {
			while(curr.left != null) curr = curr.left;			
		}

		return curr;
	}

	//	public Node deleteElement(Node root, int ele) {
	//		if(root == null) return null;
	//		
	//		if(root.data == ele) {
	//			
	//		}
	//		return null;
	//	}

	//	public void delete(int ele) {
	//		this.root = deleteElement(this.root,ele);
	//	}

	public void levelOrderPrint() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {
			Node ele = queue.remove();

			if(ele == null) {
				System.out.println();
				if(!queue.isEmpty()) queue.add(null);
				continue;
			}

			System.out.print(ele.data + " ");

			if(ele.left != null) queue.add(ele.left);
			if(ele.right!= null) queue.add(ele.right);
		}
	}
	public String formate(String str, int len) {
		len = len - str.length();
		return " ".repeat(len/2) + str;
	}
	public void AdvancePrinting() {
		Queue<Node> queue = new LinkedList<Node>();
		Queue<Node> queue2 = new LinkedList<Node>();
		queue.add(root);

		int flag = 1;
		int height =  (int) Math.pow(2, height(root)-1);
		String line = "";
		while(!queue.isEmpty() && flag == 1) {
			flag = 0;
			
			while(!queue.isEmpty()) {
				Node ele = queue.remove();

				if(ele.data == -1) {
					line += " . ";
					queue2.add(new Node(-1));
					queue2.add(new Node(-1));
					continue;
				}

				line +=  " " + ele.data + " ";
				flag = 1;
				if(ele.left != null) queue2.add(ele.left);
				else queue2.add(new Node(-1));
				if(ele.right!= null) queue2.add(ele.right);
				else queue2.add(new Node(-1));
			}
			if(flag == 1) System.out.println("\n"+formate(line, 60));
			line = "";
			queue.addAll(queue2);
			queue2.clear();
			
		}
	}
}
