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
		if(head.left != null) Preorder(head.left);
		if(head.right != null) Preorder(head.right);
	}

	public void Postorder(Node head) {
		if(head.left != null) Postorder(head.left);
		if(head.right != null) Postorder(head.right);
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
	
	public void IterativePostOrder() {
		if(root == null) return;
		
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		
		Node currentNode = root;
		stack1.push(currentNode);
		while(!stack1.isEmpty()) {
			
			Node ele = stack1.pop();
			stack2.push(ele);
			
			if(ele.left != null) stack1.push(ele.left);
			if(ele.right != null) stack1.push(ele.right);
		}
		while(!stack2.isEmpty()) {
			System.out.print(stack2.pop().data + " ");
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
	public int maxInTree() {
		return maxTreeRecursive(this.root,Integer.MIN_VALUE);
	}
	public int maxTreeRecursive(Node root,int maximum) {
		
		if(root==null) return maximum;
		
		maximum = Math.max(root.data, maximum);
		return Math.max(maxTreeRecursive(root.left,maximum), maxTreeRecursive(root.right,maximum)); 
	}

	
	public int minInTree() {
		return minTreeRecursive(this.root,Integer.MAX_VALUE);
	}
	public int minTreeRecursive(Node root,int minimum) {
		
		if(root==null) return minimum;
		
		minimum = Math.min(root.data, minimum);
		return Math.min(minTreeRecursive(root.left,minimum), minTreeRecursive(root.right,minimum)); 
	}
	
	// For advance printin - optional
	public int height(Node root) {
		if(root == null)return 0;
		return 1 + Math.max(height(root.left), height( root.right));
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
		int height =  (int) Math.pow(2, height(root)+1);
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

				line += " "+ele.data + " ";
				flag = 1;
				if(ele.left != null) queue2.add(ele.left);
				else queue2.add(new Node(-1));
				if(ele.right!= null) queue2.add(ele.right);
				else queue2.add(new Node(-1));
			}
			if(flag == 1) System.out.println("\n"+formate(line, height));
			line = "";
			queue.addAll(queue2);
			queue2.clear();
			
		}
	}
}
