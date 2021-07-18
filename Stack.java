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

}
