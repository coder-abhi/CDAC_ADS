package tree;

public interface TreeInterface {
	void insertOnePointer(int element);
	void insertTwoPointer(int element);
	void delete(int element);
	void deleteAll();
	
	int height();
	
	void PrintInorder();
	void PrintPostorder();
	void PrintPreorder();
}
