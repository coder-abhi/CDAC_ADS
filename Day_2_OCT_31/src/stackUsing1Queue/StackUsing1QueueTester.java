package stackUsing1Queue;

public class StackUsing1QueueTester {

	public static void main(String[] args) {
		StackUsing1Queue stack = new StackUsing1Queue();
		stack.push(5);
		stack.push(15);
		stack.push(25);
		stack.push(35);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
