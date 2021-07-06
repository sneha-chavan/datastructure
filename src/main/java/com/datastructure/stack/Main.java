package com.datastructure.stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOperations stack = new StackOperations();
		stack.push(30);
		stack.push(80);
		stack.push(60);
		stack.push(20);
		stack.display();

		System.out.println("pop till stack is empty");
		stack.display();
		
		System.out.println("lets peek in stack");
		stack.peek();
		
		try {
			stack.peekAndPopTillEmpty();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Exception: " + e.getMessage()); 
		}
		

	}

}
