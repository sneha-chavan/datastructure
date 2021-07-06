package com.datastructure.queue;

import com.datastructure.stack.Stack;

public class QueueOperations {
	Stack head = null;
	public void enqueue(int item) {
		Stack newQueueData = new Stack();
		newQueueData.setData(item);
		newQueueData.setNode(null);
		if(head == null) {
			head = newQueueData;
		}
		else {
			if(head.getNode()==null) {
				head.setNode(newQueueData);
			}
			else {
				Stack tempNode=head;
				while(tempNode.getNode()!=null) {
					tempNode = tempNode.getNode();
				}
				tempNode.setNode(newQueueData);
			}
		}
	}
	
	public void dequeue() {
		Stack temp = head.getNode();
		head = temp;
	}
	
	public void displayQueue() {
		System.out.println("Values:-");
		Stack temp = head;
		while(temp != null) {
			System.out.println(temp.getData());
			temp= temp.getNode();
		}
	}

}
