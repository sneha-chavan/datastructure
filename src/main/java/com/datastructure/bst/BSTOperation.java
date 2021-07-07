package com.datastructure.bst;

public class BSTOperation<K extends Comparable<K>> {
	public Node<K> root;
	
	public void add(K data) {
		root = insert(root, data);
	}
	
	public Node<K> insert(Node<K> root, K data) {
		Node<K> newNode = new Node<>(data);
		if(root == null) {
			return newNode;
		}
		
		int compare = data.compareTo(root.data);
		if(compare <0) {
			root.left=insert(root.left, data);
		}
		else if(compare>0){
			root.right=insert(root.right, data);
		}
	return root;
	}
}
