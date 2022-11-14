package reverseInStack;

public class ReverseInStackTester {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		stack.push(30);
		stack.push(35);
		stack.push(40);
		
		stack.reverse(4);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
