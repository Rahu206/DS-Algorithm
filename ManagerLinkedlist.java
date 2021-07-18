package com.linkedList;

public class ManagerLinkedlist {
	public static void main(String[] args) {
		SimpleLinkedList<Integer> numberList = new SimpleLinkedList<Integer>();
		numberList.add(56);
		numberList.add(70);
		numberList.addAtIndex(1, 30);
		numberList.show();

	}
	}

