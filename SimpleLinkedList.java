package com.linkedList;


public class SimpleLinkedList<E> {
	Node<E> head;

	/**
	 * Purpose : To add elements to linked list
	 * 
	 * @param data from main function
	 */
	public void add(E data) {
		Node<E> newNode = new Node<>();
		newNode.data = data;
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node<E> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}


	public void show() {
		Node<E> temp = head;
		System.out.println();
		System.out.print("[ ");
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ]");
	}

}