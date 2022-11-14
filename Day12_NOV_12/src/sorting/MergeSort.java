package sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void Merge(int[] arr,int low, int mid, int high) {
		int i=low;
		int j = mid+1;
		int TempArr[] = new int[high+1];
		int k = 0;
		
		while(i <= mid && j<=high) {
			if(arr[i] < arr[j]) TempArr[k++] = arr[i++];
			else TempArr[k++] = arr[j++];
		}
		
		while(i <= mid) TempArr[k++] = arr[i++];
		while(j <= mid) TempArr[k++] = arr[j++];
		
		int tempK = low;
		for(int ind=0; ind<k ; ind++) {
			arr[tempK++] = TempArr[ind];
		}
	}
	
	public static void mergeSort(int arr[], int low, int high) {
		if(low < high) {
			int mid = (low+high) / 2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			Merge(arr,low,mid,high);
		}
	}

	public static void main(String[] args) {
		int arr[] = {12,3,54,21,90,01};
		
		mergeSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}

}
