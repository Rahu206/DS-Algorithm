package com.linkedList;


public class SimpleLinkedList {
        Node head;
	
	
	public void insertFirst(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = head;
		head = newNode;
		
		
		System.out.println("Element added First to Linked list: "+element);
		
	}public void insertSecond(int element) {
		Node currentNode= head;
		
		while (currentNode.next !=null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data=element;
		currentNode.next=newNode;
		
		System.out.println("Element inserted at Second: " +element);
	}
	
	public void insertLast(int element) {
		Node currentNode= head;
		
		while (currentNode.next !=null) {
			currentNode = currentNode.next;
		}
		Node newNode = new Node();
		newNode.data=element;
		currentNode.next=newNode;
		
		System.out.println("Element inserted at Last: " +element);
	}
}
