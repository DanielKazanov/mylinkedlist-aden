package MyLinkedList;

public class LLNode<E> {
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}
	
	// TODO: Add a parameterized constructor that also inserts the node 
	//       in the correct location in the list
	public LLNode(E e, LLNode<E> prev, LLNode<E> next) { // <E>
		this.data = e;
		prev.next = this;
		next.prev = this;
		this.next = next;
		this.prev = prev;
	}

}
