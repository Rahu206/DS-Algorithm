package com.linkedList;

public class Stack<E> {
	Node<E> top;
	int size;
	/**
	 * Pushes a element into stack
	 * @param data from user
	 */
	public void push(E data) {
		Node<E> newNode = new Node<>();
		newNode.data = data;
		newNode.next = null;
		newNode.next = top;
		top=newNode;
		size++;		
	}
	/**
	 * Pop : Deletes the top element of stack
	 */
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			System.exit(0);
		}
		top=top.next;
		size--;
	}
	/**
	 * @return size of stack
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Tells if stack is empty or not
	 * True if empty , false otherwise
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size ==0;
	}

}
