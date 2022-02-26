package com.bk.gfg.ds.linked.list.singly;

import java.util.Stack;


public class MovelastElementToFirst {

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

	public void moveLastToFirst() {
		Node secondLast = null;
		Node last = head;
		while(last.next!=null) {
			secondLast=last;
			last=last.next;
		}
		secondLast.next=null;
		last.next=head;
		head=last;

	}

	public void printList() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}


	public static void main(String[] args) {
		MovelastElementToFirst list = new MovelastElementToFirst();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);
		list.printList();
		System.out.println("-----------");
		list.moveLastToFirst();
		list.printList();
	}
}
