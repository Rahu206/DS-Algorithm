package com.linkedList;

public class ManagerLinkedlist {
	public static void main(String[] args) {
		SimpleLinkedList<Integer> numberList = new SimpleLinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(70);
		System.out.println("Linked list before using pop method");
		numberList.show();
		System.out.println();
		numberList.pop();
		System.out.println("Linked List after using pop method");
		numberList.show();
	}
}