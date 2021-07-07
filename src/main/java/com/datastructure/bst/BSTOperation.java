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
	
	//get Size
	int size()
    {
        return size(root);
    }
  
    
    int size(Node node)
    {
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }
    
    public boolean search(K data) {
    	boolean exist = this.isNodeExist(root, data);
    	return exist;
    }
    
    public boolean isNodeExist(Node<K> root, K data) {  	
    	if(root == null) {
    		return false;
    	}
    	if(root.data == data) {
    		return true;
    	}
    	boolean isPresentAtLeft = isNodeExist(root.left, data);
    	if(isPresentAtLeft)
    		return isPresentAtLeft;
    	
    	boolean isPresentAtRight = isNodeExist(root.right, data);
    	return isPresentAtRight;
    }
}
