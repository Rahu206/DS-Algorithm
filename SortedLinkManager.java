package com.linkedList;

public class SortedLinkManager {
	public static void main(String[] args) {
		SortedLinkedList<Integer> numberList = new SortedLinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(40);
		numberList.add(70);
		System.out.println("Elements of the list are: ");
		numberList.show();

	}


}
