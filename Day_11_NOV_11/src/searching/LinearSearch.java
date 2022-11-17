package searching;

public class LinearSearch {
	public static boolean linearSearch(int arr[], int ele) {
		for(int i: arr) {
			if(i == ele) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int input[] = new int[] {12,23,43,43,54};
		
		System.out.println(linearSearch(input, 11));
	}

}
