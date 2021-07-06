package com.datastructure.linkedlist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainLinkedList {

	public static void main(String[] args) {
		SpringApplication.run(MainLinkedList.class, args);
		LinkedList linkedList = new LinkedList();
		LinkedList linkedListAppend = new LinkedList();
		
		//adding data infront
		linkedListAppend.append(56);
		linkedListAppend.append(30);
		linkedListAppend.append(70);
		linkedListAppend.append(40);
		
		//append data
		linkedList.add(70);
		linkedList.add(30);
		linkedList.add(56);
		linkedList.add(76);
		
		
		
		
		//insert data between two node
		linkedListAppend.insert(56, 30, 65);
		
		//displaying all nodes
		linkedListAppend.displayAppendNodes();
		linkedList.displayAppendNodes();
		System.out.println("-------------");
		//linkedList.delete();
		linkedList.displayAppendNodes();
		
	}

}
