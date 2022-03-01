package com.bk.gfg.ds.linked.list.circular;

import java.util.ArrayList;
import java.util.List;

public class CircularLinkedList {

	Node head;
	Node head1;
	Node head2;

	protected static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}

	public Node insertAtEnd(Node node ,int data,Node head) {
		Node newNode = new Node(data);
		if(head==null) {
			node = newNode;
			newNode.next=head;
			return node;
		}
		Node temp =head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=head;
		return temp;
	}

	public void insertAtFront(int data) {
		Node node = new Node(data);
		node.next=head;
		if(head==null) {
			head=node;
			node.next=head;
		}else {
			Node temp =head;
			while(temp.next!=head){
				temp=temp.next;
			}
			head =node;
			temp.next=head;
		}
	}
	
	public List<Node> splitList() {
		List<Node> list= new ArrayList<>();
		Node result1 =null;
		Node result2 =null;
		Node slow = head;
		Node fast = head;
		while(slow.next!=head && fast.next.next!=head) {
			result1=insertAtEnd(result1,slow.data,head1);
			slow=slow.next;
			fast=fast.next.next;
		}
		slow=head;
		fast=head;
		while(slow.next!=head && fast.next.next!=head) {
			result2=insertAtEnd(result2,fast.data,head2);
			slow=slow.next;
			fast=fast.next.next;
		}
		
		list.add(result1);
		list.add(result2);
		return list;
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
	
	public void printSplitList(List<Node> nodeList) {
		Node node1=nodeList.get(0);
		Node node2=nodeList.get(1);
		if(node1!=null) {
			do {
				System.out.println(node1.data);
				node1=node1.next;
			}while(node1!=head);
		}
		System.out.println("---------------------");
		if(node2!=null) {
			do {
				System.out.println(node2.data);
				node2=node2.next;
			}while(node2!=head);
		}
	}

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertAtFront(1);
		list.insertAtFront(2);
		list.insertAtFront(3);
		list.insertAtFront(4);
		list.printList();
		System.out.println("#########");
		list.printSplitList(list.splitList());
	}

}
