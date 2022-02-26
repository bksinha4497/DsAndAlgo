package com.bk.gfg.ds.linked.list.singly;

import java.util.Stack;


public class RemoveDuplicatesFromSortedList {

	Node head;
	
	protected static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		Node node =head;
		while(node.next!=null) {
			node=node.next;
		}
		node.next=newNode;
	}
	
	public void removeDuplicates() {
		Node node = head;
		while(node!=null) {
			Node tempNode = node;
			while(tempNode!=null && tempNode.data==node.data) {
				tempNode=tempNode.next;
			}
			node.next=tempNode.next;
			node=node.next;
		}

	}
	
	public void printList() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.printList();
		list.removeDuplicates();
		System.out.println("-----------");
		list.printList();
	}
}
