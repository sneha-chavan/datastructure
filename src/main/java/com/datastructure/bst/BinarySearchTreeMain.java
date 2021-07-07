package com.datastructure.bst;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BSTOperation<Integer> binaryTree = new BSTOperation<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(11);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		
		//size of tree- total number of nodes
		int size =binaryTree.size();
		System.out.println("total nodes "+size);
		
		//search a node if present
		Boolean isExist = binaryTree.search(94);
		System.out.println(isExist);
	}

}
