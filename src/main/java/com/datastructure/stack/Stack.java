package com.datastructure.stack;

public class Stack {
	private int data;
	private Stack node;
	
	public Stack() {
		super();
	}

	public Stack(int data, Stack node) {
		super();
		this.data = data;
		this.node = node;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Stack getNode() {
		return node;
	}

	public void setNode(Stack node) {
		this.node = node;
	}
	
	

}
