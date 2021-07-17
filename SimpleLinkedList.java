package com.linkedList;


public class SimpleLinkedList {
        Node head;
	
	
	public void insertFirst(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = head;
		head = newNode;
		
		System.out.println(+element);
		
	//	System.out.println("Element added to Linked list: "+element);
	}

}
