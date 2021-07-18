package com.linkedList;

public class ManagerLinkedlist {
	public static void main(String[] args) {
		SimpleLinkedList<Integer> numberList = new SimpleLinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(40);
		numberList.add(70);
		System.out.println("Linked List Elements");
		numberList.show();
		System.out.println();
		int result = numberList.searchWithValue(40);
		numberList.delete(result);
		numberList.show();
		System.out.println("The size of the list is: "+numberList.size());

		
		
		
	}
}
