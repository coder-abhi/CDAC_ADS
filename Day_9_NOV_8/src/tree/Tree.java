package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Tree{
	Node root;
	public static Scanner sc = new Scanner(System.in);
	public Tree() {
		root = null;
	}
	
	// Creating a Tree
	public void createTree() {
		System.out.println("Enter Root data : ");
		this.root = addElement(root);
	}
	public Node addElement(Node root) {
		int data = sc.nextInt();
		if(data == -1) return null;
		root = new Node(data);
		System.out.println("Enter left of "+ root.data);
		root.left =  addElement(root.left);
		
		System.out.println("Enter right of :"+ root.data);
		root.right = addElement(root.right);
		
		return root;
		}
	
	// Printing Tree
	public void Inorder(Node head) {
		if(head.left != null) Inorder(head.left);
		System.out.print(head.data + " ");
		if(head.right != null) Inorder(head.right);
	}

	public void Preorder(Node head) {
		System.out.print(head.data + " ");
		if(head.left != null) Inorder(head.left);
		if(head.right != null) Inorder(head.right);
	}

	public void Postorder(Node head) {
		if(head.left != null) Inorder(head.left);
		if(head.right != null) Inorder(head.right);
		System.out.print(head.data + " ");
	}
	
	public void PrintInorder() {
		if(root != null) Inorder(root);
	}

	public void PrintPostorder() {
		if(root != null) Postorder(root);		
	}

	public void PrintPreorder() {
		if(root != null) Preorder(root);
	}

	// deleteNode recursive function for deleting all nodes
	public void deleteNode(Node root) {
		if(root.left != null) deleteNode(root.left);
		if(root.right != null) deleteNode(root.right);
		root.data = -1;
	}

	public void deleteAll() {
		if(root == null) return;
		deleteNode(root);
	}

	public int CountHeight(Node root) {
		if(root == null ) return 0;
		return 1 + Math.max(CountHeight(root.left), CountHeight(root.right));
	}

	public int height() {
		return CountHeight(root);
	}
	
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
	
	public void IterativeInOrder() {
		Stack<Node> stack = new Stack<Node>();
		Node currentNode = root;
		while(currentNode != null) {
			stack.push(currentNode);
			currentNode = currentNode.left;
		}
		
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			System.out.print(temp.data + " ");
			
			currentNode = temp.right;
			
			while(currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
		}
	}
	
	public void IterativePreOrder() {
		Stack<Node> stack = new Stack<Node>();
		Node currentNode = root;
		while(currentNode != null) {
			stack.push(currentNode);
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.left;
		}
		
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			
			currentNode = temp.right;
			
			while(currentNode != null) {
				stack.push(currentNode);
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.left;
			}
		}
	}
	
	public Node InversionOfTree(Node root) {
		if(root == null) return null;
		root.left = InversionOfTree(root.left);
		root.right = InversionOfTree(root.right);
		Node ref = root.left ;
		root.left = root.right;
		root.right = ref;
		return root;
	}
}
