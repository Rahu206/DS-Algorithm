package com.linkedList;

public class ManagerLinkedlist {
	public static void main(String[] args) {
		SimpleLinkedList<Integer> numberList = new SimpleLinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(70);
		System.out.println("Linked list elements");
		numberList.show();
		System.out.println();
		int result = numberList.searchWithValue(30);
		numberList.addAtIndex(result + 1, 40);
		numberList.show();

	}

}
