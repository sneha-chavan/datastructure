package com.datastructure.linkedlist;

public class LinkedList {
	Node next;
	Node head= null, tail=null;
	
	public void appendNode(int data) {
		
	}

	// adding node in front
	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next=null;
		if(head == null && tail== null) {
			head = newNode;
			tail = newNode;
		}
		Node tempNode = head;
		head = newNode;
		tempNode.next = head;
	}
	
	//appending data
	public void append(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next=null;
		if(head == null && tail== null) {
			head = newNode;
			tail = newNode;
		}
		Node tempNode = tail;
		tail = newNode;
		tempNode.next = tail;
	}
}
