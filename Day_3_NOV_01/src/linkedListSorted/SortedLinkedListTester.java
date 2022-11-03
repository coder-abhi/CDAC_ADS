package linkedListSorted;

import java.util.Scanner;

public class SortedLinkedListTester {

	public static void main(String[] args) {

		LinkedListSorted list = new LinkedListSorted();

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter ele : ");

		int ele;
		while((ele = sc.nextInt()) != -1) {
			list.add(ele);
			list.printLinkedList();
			System.out.print("\nEnter ele : ");
		}
	}

}
