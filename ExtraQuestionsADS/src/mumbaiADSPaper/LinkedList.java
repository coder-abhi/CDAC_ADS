package mumbaiADSPaper;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
	Node head;
	public LinkedList() {
		head = null;
	}
	public void addAtFront(int element) {
		
		Node newNode = new Node(element);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	
	public void printLinkedList() {
		
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}
	public void addAtRear(int element) {
		if(head == null) {
			addAtFront(element);
			return;
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(element);
		
	}
	public void addAtMid(int index, int element) {
		// Checking if index is invalid
		if(index < 0 || index > count()+1) {
			System.out.println("Invalid Index");
			return;
		}
		if(index ==1) {
			addAtFront(element);
			return;
		}
		
		Node NewElement = new Node(element);
		Node currentNode = head;
		for(int i=1;i<index-1;i++) {
			currentNode = currentNode.next;
		}
		NewElement.next = currentNode.next;
		currentNode.next = NewElement;
	}
	
	public int count() {
		int count = 0;
		Node currentNode = head;
		while(currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}
	
	public int deleteAtFront() {
		if(head == null) {
			System.out.println("Linked List is already empty");
			return -1;
		}
		int data;
		if(count() == 1) {
			data = head.data;
			head =  null;
			return data;
		}
		
		data = head.data;
		head = head.next	;
						return data;
	}

	public int deleteAtMid(int index) {
		if(index < 1 || index > count()) {
			System.out.println("Invalid index");
			return -1;
		}
		if(index == 1) return deleteAtFront();
		
		Node prev = null;
		Node currentNode = head;
		for(int i=1; i<index; i++) {
			
			prev = currentNode;
			currentNode = currentNode.next;
		}
		int data = currentNode.data;
		prev.next = currentNode.next;
		currentNode = null;
		return data;
	}
	public int deleteAtRear() {
		if(head == null) {
			System.out.println("Linked List is already empty!");
			return -1;
		}
		if(head.next == null) {
			return deleteAtFront();
		}		
		Node prev = null;
		Node currentNode = head;
		
		while(currentNode.next != null) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		int data = currentNode.data;
		currentNode = null;
		prev.next = null;
		
		return data;
	}
	
	public void removeDuplicate() {
		Set<Integer> set = new HashSet<>();
		Node prev = null;
		Node currentNode = head;
		while(currentNode != null) {
			if(!set.add(currentNode.data)) {
				prev.next = currentNode.next;
				
				currentNode = currentNode.next;
			}
			prev = currentNode;
			currentNode = currentNode.next;
		}
	}
	
	public void reverseLinkedList() {
		Node prev = null;
		Node curr = head;
		Node next ;
		while(curr != null) {
			
		}
	}

			
}
