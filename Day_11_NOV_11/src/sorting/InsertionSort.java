package sorting;

import java.util.Arrays;

public class InsertionSort {
	
//	public static void insertionS

	public static void main(String[] args) {
		int arr[] = {12,3,54,21,90,01};
		
		int sortedSize = 1;
		while(sortedSize < arr.length) {
			int insertEle = arr[sortedSize];
			
			int currentPos = sortedSize - 1;
			while(currentPos >= 0) {
				if(arr[currentPos] < insertEle) {
					break;
				}
				arr[currentPos+1] = arr[currentPos];
				arr[currentPos] = insertEle;
				currentPos--;
			}
			sortedSize++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
