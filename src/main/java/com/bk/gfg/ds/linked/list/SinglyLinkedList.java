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
	
	public void insertAtEnd(int data) {
		if(head==null) {
			head = new Node(data);
			head.next=null;
		}else {
			Node node = new Node(data);
			node.next=null;
			head.next=node;
		}
	}
	public void insertAtFront(int data) {
			Node node = new Node(data);
			node.next=head;
			head =node;
	}
	
	public void insertAfter(Node prevNode , int data) {
		if(prevNode==null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		Node node = new Node(data);
		node.next=prevNode.next;
		prevNode.next=node;
	}
	
	public Node getNodeForElement(int data) {
		Node node = head;
		while(node!=null) {
			if(node.data==data) {
				return node;
			}
			node=node.next;
		}
		return null;
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
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtFront(3);
		list.insertAtFront(4);
		list.insertAfter(list.getNodeForElement(4), 5);
		list.printList();
	}

}
