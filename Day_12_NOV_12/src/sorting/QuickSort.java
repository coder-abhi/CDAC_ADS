package sorting;

import java.util.Arrays;

public class QuickSort {
	public static void swapData(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static int partition(int[] arr, int l, int r) {
		int pivot = l;
		
		int left = l+1;
		int right = r;
		
		// while left and right don't cross each other
		while(left <= right) {
			// while left element is smaller than pivot ele -> increatment left
			while(left<=right && arr[pivot] >= arr[left]) left++;
			
			// while right element is bigger than pivote ele -> decreament right
			while(left<=right && arr[pivot] < arr[right]) right--;
			
			// swapping left and right
			if(left<right)swapData(arr, left, right);
		}
		
		// swapping right with pivot
		swapData(arr, right, pivot);
		return right;
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left < right) {
		int part = partition(arr,left,right);
		quickSort(arr,left,part);
		quickSort(arr,part+1,right);
		}
	}
	
	// Tester
	public static void main(String[] args) {
		int arr[] = {12,3,54,21,90,01};
		
		quickSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

}
