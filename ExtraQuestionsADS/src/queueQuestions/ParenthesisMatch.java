package queueQuestions;

import java.util.Stack;
import java.util.zip.CRC32;

public class ParenthesisMatch {

	public static boolean CheckParenthesis(String input) {
		Stack<Character> stack = new Stack();

		// pushing all opening brackets to stack
		for(int i=0; i<input.length() ; i++) {
			Character currEle = input.charAt(i);
			if(currEle== '(' || currEle== '[' ||currEle== '{') {
				stack.push(currEle);
				System.err.println("Push : "+currEle);
				continue;
			}
			
			
			// checking opening-closing pair of elements while removing from stack
			System.out.println(currEle);
			switch(currEle) {
			case ')': if('(' != stack.pop()) return false;
			break;
			case ']': if('[' != stack.pop()) return false;
			break;
			case '}': if('{' != stack.pop()) return false;
			break;
			}
		}
		
		if(!stack.isEmpty()) return false;
		return true;

		
	}

	public static void main(String[] args) {
		String input = "()[]";

		System.out.println(CheckParenthesis(input));

	}

}
