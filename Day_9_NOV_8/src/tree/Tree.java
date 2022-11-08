package tree;

public class Tree implements TreeInterface{
	Node root;
	public Tree() {
		root = null;

	}

	//Inserting Element using 2 pointer
	@Override
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


	@Override
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
	@Override
	public void delete(int element) {
		Node curr = root;
		Node prev = null;
		while(curr != null) {
			prev = curr;
			if(element == curr.data)
				if(element < curr.data) curr = curr.left;
				else curr = curr.right;
		}
	}
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
	@Override
	public void PrintInorder() {
		Inorder(root);
	}

	@Override
	public void PrintPostorder() {
		Postorder(root);		
	}

	@Override
	public void PrintPreorder() {
		Preorder(root);
	}

	
	public void deleteNode(Node root) {
		if(root.left != null) deleteNode(root.left);
		if(root.right != null) deleteNode(root.right);
		root.data = -1;
	}
	
	@Override
	public void deleteAll() {
		if(root == null) return;
		deleteNode(root);
	}

	public int CountHeight(Node root) {
		if(root == null ) return 0;
		return 1 + Math.max(CountHeight(root.left), CountHeight(root.right));
	}

	@Override
	public int height() {
		return CountHeight(root);
	}



}
