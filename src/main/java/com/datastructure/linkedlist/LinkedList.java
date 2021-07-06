package com.datastructure.linkedlist;

public class LinkedList {
	Node next;
	Node head= null;
	
	// adding node in front
	public void append(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next=null;
		
		if(head == null) {
			head = newNode;
		}
		else {
				Node tempNode = head;
				while(tempNode.next != null) {
					tempNode= tempNode.next;
				}
				tempNode.next = newNode;
		
		}
	}
	
	//appending data
	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next=null;
		newNode.next = head;
		head = newNode;

	}
	
	//inserting node in between two other nodes
	public void insert(int top, int bottom, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next=null;
		Node tempNode = head;
//		System.out.println(head);
		while(tempNode.next != null){
			if (tempNode.data == top && tempNode.next.data == bottom) {
				Node temp = tempNode.next;
				tempNode.next = newNode;
				newNode.next= temp;
				System.out.println("inserted");
				break;
			}
			else {
				System.out.println("not inserted");
			}
		}
		
	}
	
	public Node delete() {
		Node tempNode = this.head;
		this.head = head.next;
		return tempNode;		
	}
		
	public void displayAppendNodes() {
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}
