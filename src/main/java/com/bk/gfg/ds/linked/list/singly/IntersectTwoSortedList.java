package com.bk.gfg.ds.linked.list.singly;

import java.util.Stack;

import com.bk.gfg.ds.linked.list.singly.MovelastElementToFirst.Node;


public class IntersectTwoSortedList {

	Node a , b;
	Node dummy;

	protected static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
	}

	public void sortedIntersect() {
		Node one = a;
		Node two = b;
		while(one!=null && two!=null) {
			if(one.data==two.data) {
				insertAtEnd(one.data);
				one=one.next;
				two=two.next;
			}else if (one.data<two.data) {
				one=one.next;
			}else {
				two=two.next;
			}
		}
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(dummy==null) {
			dummy = newNode;
			return;
		}
		Node node =dummy;
		while(node.next!=null) {
			node=node.next;
		}
		node.next=newNode;
	}

	public void printList() {
		Node node = dummy;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}

	public static void main(String[] args) {
		IntersectTwoSortedList list = new IntersectTwoSortedList();
		  
        list.a = new Node(1);
        list.a.next = new Node(2);
        list.a.next.next = new Node(3);
        list.a.next.next.next = new Node(4);
        list.a.next.next.next.next = new Node(6);
 
        list.b = new Node(2);
        list.b.next = new Node(4);
        list.b.next.next = new Node(6);
        list.b.next.next.next = new Node(8);
        
        list.sortedIntersect();
		list.printList();
	}
}
