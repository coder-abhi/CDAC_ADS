package sorting;

import java.util.Arrays;

public class HeapSort {
	public static void insert(int[] arr, int index) {
		int element = arr[index];
		int i = index;
		while(i > 1 && element > arr[i/2]) {
			arr[i] = arr[i/2];
			i /= 2 ;
		}
		arr[i] = element;
	}
	public static void swapData(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void delete(int[] arr, int index) {
		int element = arr[1];
		arr[1] = arr[index];
		int i = 1;
		int j = i*2;
		while(j < index) {
			if(arr[j] < arr[j+1]) j = j+1;
			if(arr[i] < arr[j]) {
				swapData(arr,i,j);
				i = j;
				j = j*2;
			}
			else break;
		}
		arr[index] = element;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {0,15 ,23 ,40 ,29 ,5 ,36 ,67 ,84 ,3 ,44 ,17 ,51 ,90 ,42 ,38};
		
		// for heap sort 
		// we will insert all elements in heap and delete all again
		
		for(int i=1;i<arr.length; i++) {
			insert(arr,i);			
		}
		for(int i=arr.length-1;i>0; i--) {
			delete(arr, i);			
		}
		System.out.println(Arrays.toString(arr));
	}

}
