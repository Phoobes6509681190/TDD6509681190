package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	boolean push(Object elm)throws Exception;
	Object top();
}
