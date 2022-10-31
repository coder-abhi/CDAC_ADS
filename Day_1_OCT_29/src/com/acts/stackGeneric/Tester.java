package com.acts.stackGeneric;

public class Tester {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>(5);
		st.push("Hello");
//		System.out.println(st.top);
		st.push("Good");
//		System.out.println(st.top);
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
