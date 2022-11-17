package searching;

public class BinarySearch {
	public static boolean binarySearch(int arr[],int low, int high, int ele) {
		while(low < high) {
			int mid = (low+high)/2;
			if(ele == arr[mid]) return true;
			if(ele < arr[mid]) high = mid-1;
			else low = mid+1;
		}
		return false;
	}

	public static void main(String[] args) {
		int input[] = new int[] {12,23,43,43,54};
		System.out.println(binarySearch(input, 0, input.length, 54));
	}

}
