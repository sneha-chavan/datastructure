package com.datastructure.linkedlist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainLinkedList {

	public static void main(String[] args) {
		SpringApplication.run(MainLinkedList.class, args);
		LinkedList linkedList = new LinkedList();
		
		//adding data infront
//		linkedList.add(70);
//		linkedList.add(30);
//		linkedList.add(56);
		
		//append data
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.append(40);
	}

}
