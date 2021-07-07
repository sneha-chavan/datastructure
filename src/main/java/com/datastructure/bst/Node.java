package com.datastructure.bst;

public class Node<K extends Comparable<K>> {
	K data;
	Node left;
	Node right;
	
	public Node(K d) {
		this.data = d;
		left=null;
		right=null;
	}

}
