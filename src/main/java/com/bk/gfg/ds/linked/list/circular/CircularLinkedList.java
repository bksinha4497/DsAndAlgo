package com.bk.gfg.ds.linked.list.circular;


public class CircularLinkedList {

	Node head;

	protected static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			newNode.next=head;
			return;
		}
		Node node =head;
		while(node.next!=null && node.next!=head) {
			node=node.next;
		}
		node.next=newNode;
		newNode.next=head;
	}
	
	public void insertAtFront(int data) {
		Node node = new Node(data);
		node.next=head;
		head =node;
		Node temp =head;
		if(temp.next!=null) {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=head;
		}
	}

	public void printList() {
		Node node = head;
		if(node!=null) {
			do {
				System.out.println(node.data);
				node=node.next;
			}while(node!=head);
		}
	}

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertAtFront(1);
		list.printList();
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtFront(4);
		list.printList();
	}

}
