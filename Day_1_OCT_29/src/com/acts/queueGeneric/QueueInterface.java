package com.acts.queueGeneric;

public interface QueueInterface<T> {
	public T deleteQ();
	public boolean isFull();
	public boolean isEmpty();
	public void addQ(T element);
}
