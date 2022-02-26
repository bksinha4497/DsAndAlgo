package com.bk.gfg.ds.linked.list;

public class SinglyLinkedList {
	
	Node head;
	
	protected static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void insert(int data) {
		if(head==null) {
			head = new Node(data);
			head.next=null;
		}else {
			Node node = new Node(data);
			node.next=null;
			head.next=node;
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
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(1);
		list.insert(2);
		list.printList();
	}

}
