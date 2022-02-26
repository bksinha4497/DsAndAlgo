package com.bk.gfg.ds.linked.list.singly;

import java.util.Stack;


public class IsListpalindrome {

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
	
	public Boolean isPalindrome() {
		Node node = head;
		Stack<Integer> stack = new Stack<>();  
		while(node!=null) {
			stack.push(node.data);
			node=node.next;
		}
		node= head;
		while(node!=null) {
			if(node.data!=stack.pop()) {
				return false;
			}
			node=node.next;
		}
	   return true;
	}
	
	public void printList() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	
	public static void main(String[] args) {
		IsListpalindrome list = new IsListpalindrome();
		list.insertAtEnd(3);
		list.insertAtEnd(1);
		list.insertAtEnd(1);
		list.insertAtEnd(3);
		list.printList();
		System.out.println("is list palindrome: "+list.isPalindrome());
		list.printList();
		System.out.println("-----------");
		list.insertAtEnd(4);
		System.out.println("is list palindrome: "+list.isPalindrome());
		list.printList();
	}
}
