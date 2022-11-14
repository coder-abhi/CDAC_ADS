package recursion;

public class Recursion {
	public static int multiply(int a, int b) {
		
		if(b == 0) {
			return 0;
		}
		
		return a + multiply(a,b-1);
	}
	
	public static int divide(int a, int b) {
		
		if(b ==0) throw new ArithmeticException();
		
		if(a == 0) return 0;
		
		return 1 + divide(a-b,b);
	}
	
	public static int remainder(int a, int b) {
		
		if(b ==0) throw new ArithmeticException();
		
		if(a< b) return a;
		
		return 0 + remainder(a-b,b);
	}
	
	
	/*
	public static void FunRec(int num) {
		if(num == 0) {
			return;
		}
		System.out.println(num);
		FunRec(num-1);
	}
	*/
	public static int factorial(int num) {
		if(num == 0) return 1;
		return num * factorial(num - 1);
	}
	
	public static void main(String[] args) {
//		System.out.println(multiply(10,2));
//		System.out.println(divide(12,1));
//		System.out.println(remainder(13, 5));
		System.out.println(factorial(1));
	}

}
