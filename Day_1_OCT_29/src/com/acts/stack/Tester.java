package com.acts.stack;

public class Tester {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		st.push(15);
		st.push(15);
		st.push(15);
		st.push(35);
		st.push(15);
//		System.out.println(st.top);
		st.push(55);
//		System.out.println(st.top);
		System.out.println(st.pop());
		System.out.println(st.pop());
	}

}
