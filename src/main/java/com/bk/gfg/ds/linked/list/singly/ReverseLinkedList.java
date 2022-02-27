package com.bk.gfg.ds.linked.list.singly;

import java.util.Stack;

import com.bk.gfg.ds.linked.list.singly.IntersectTwoSortedList.Node;



public class ReverseLinkedList {

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

	public void printList() {
		Node node = head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}

	public void reverse() {
		Stack<Node> stack =  new Stack<>();
		Node cur = head;
		while(cur.next!=null) {
			stack.push(cur);
			cur=cur.next;
		}
		head=cur;
		while(!stack.isEmpty()) {
				cur.next = stack.pop();
				cur=cur.next;
		}
		cur.next=null;
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.printList();
		list.reverse();
		System.out.println("-----------");
		list.printList();
	}

}
