package bst;


public class BST {

	Node root;
	public BST() {
		root = null;
	}
	
	// Simple swapping of data of 2 Nodes
	public void swapNode(Node a, Node b) {
		int temp = a.data;
		a.data = b.data;
		b.data = temp;
	}

	//Inserting Element using 2 pointer
	public void insertTwoPointer(int element) {
		Node newNode = new Node(element);
		if(root == null) {
			root = newNode;
			return;
		}
		Node curr = root;
		Node prev = null;
		while(curr != null) {
			prev = curr;
			if(element < curr.data) curr = curr.left;
			else curr = curr.right;
		}
		if(element < prev.data) prev.left = newNode;
		else prev.right = newNode;
	}

	// Inserting element using 1 pointer
	public void insertOnePointer(int element) {
		Node newNode = new Node(element);
		if(root == null) {
			root = newNode;
			return;
		}
		Node curr = root;
		while(true) {
			if(element < curr.data) {
				if(curr.left != null) curr = curr.left;
				else {
					curr.left = newNode;
					return;
				}
			}else {
				if(curr.right != null) curr = curr.right;
				else {
					curr.right = newNode;
					return;
				}
			}
		}

	}
	
	// TODO delete element
	public void delete(int element) {
		Node currentNode = root;
		Node parentNode = null;
		while(currentNode != null) {
			if(element == currentNode.data) {
				// If element is leaf node
				if(currentNode.right == null && currentNode.left == null) {
					// Checking if element is root, so we will empty tree
					if(parentNode == null) {
						root = null;
						return;
					}
					
					if(element < parentNode.data) parentNode.left = null;
					else parentNode.right = null;
					return;
				}
				
				// if element have only right child
				if(currentNode.left == null) {
					// if deleting element is root
					if(parentNode == null) {
						root = currentNode.right;
						return;
					}
					if(element < parentNode.data) parentNode.left = currentNode.right;
					else parentNode.right = currentNode.right;
					return;
				}
				
				// if element have only left child
				if(currentNode.right == null) {
					// if deleting element is root
					if(parentNode == null) {
						root = currentNode.left;
						return;
					}

					if(element < parentNode.data) parentNode.left = currentNode.left;
					else parentNode.right = currentNode.left;
					return;
				}
				
				// If element have both left and right child
				Node travParent = currentNode;
				Node trav = currentNode.right;
				while(trav.left != null) {
					travParent = trav;
					trav = trav.left;
				}

				swapNode(travParent, trav);
				
				if(trav.data < travParent.data) travParent.left = trav.right;
				else travParent.right = trav.right;
				 return;
			}

			parentNode = currentNode;
			if(element < currentNode.data) currentNode = currentNode.left;
			else currentNode = currentNode.right;
		}
	}
	
	public void Inorder(Node head) {
		if(head.left != null) Inorder(head.left);
		System.out.print(head.data + " ");
		if(head.right != null) Inorder(head.right);
	}

	
	public void PrintInorder() {
		if(root != null) Inorder(root);
	}



}
