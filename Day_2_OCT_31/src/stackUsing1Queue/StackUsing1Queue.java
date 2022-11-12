package stackUsing1Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1Queue {
	Queue<Integer> queue;
	public StackUsing1Queue() {
		queue = new LinkedList<Integer>();
	}
	
	public void push(int ele) {
		queue.add(ele);
		for(int i=0; i<queue.size()-1 ; i++) {
			queue.add(queue.remove());
		}
	}
	
	public int pop() {
		return queue.remove();
	}
	
	public int size() {
		return queue.size();
	}
	
}
