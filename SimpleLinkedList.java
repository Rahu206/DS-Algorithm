package com.linkedList;


public class SimpleLinkedList {
	
	Node head;
	
	
	/**
	 * Purpose : To add elements to linked list
	 * @param data from main function
	 */
	public void add(int data) {
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=null;
		
		if(head==null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next !=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	/**
	 * Method to print all elements of linked list
	 */
	public void show() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	

}

