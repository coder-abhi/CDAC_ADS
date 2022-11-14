package stackGeneric;

public interface StackInterface <T> {
	boolean isEmpty();
	boolean isFull();
	void push(T element);
	T pop();
}