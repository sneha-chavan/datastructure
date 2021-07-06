package com.datastructure.queue;

import com.datastructure.stack.Stack;
import com.datastructure.stack.StackOperations;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueOperations queue = new QueueOperations();
		
		//enqueue items
		queue.enqueue(40);
		queue.enqueue(90);
		queue.enqueue(60);
		queue.enqueue(20);
		queue.enqueue(50);
		
		queue.displayQueue();
		queue.dequeue();
		
		System.out.println("after");
		queue.displayQueue();
	}

}
