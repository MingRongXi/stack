package stack;

public class Stack<E> {
	SequenceList<E> list = new SequenceList<>();
	int size;
	public Stack(){
		
	}
	
	public void push(E element) {
		list.add(element);
		size++;
	}
	
	public E  pop() {
		size--;
		return list.remove();
	}
	
	public E top() {
		return list.getElement();
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void clean() {
		while(size > 0) {
			list.remove();
		}
	}
}
