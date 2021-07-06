package com.datastructure.stack;

public class StackOperations {
	Stack head = null;
	
	//pushing top value in stack
	public void push(int data) {
		Stack newStack = new Stack();
		newStack.setData(data);
		newStack.setNode(null);
		if(head == null) {
			head = newStack;
		}
		else {
			newStack.setNode(head);
			head=newStack;
		}
	}
	
	//display all values in stack
	public void display() {
		System.out.println("Stack values");
		Stack temp = head;
		while(temp != null) {
			System.out.println(temp.getData());
			temp= temp.getNode();
		}
	}
	
	//pop data
	public void pop() {
		Stack reSet = head.getNode();
		System.out.println("popping: "+ reSet.getData());
		head.setData(reSet.getData());
		head.setNode(reSet.getNode());
	}
	
	public void peek() {
		System.out.println(head.getData());
	}

	public void peekAndPopTillEmpty() {
		while(head != null) {
			peek();
			pop();
			display();
		}
	}
}
