package com.bk.gfg.ds.linked.list;

public class SinglyLinkedList {
	
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
	
	public void deleteNode(int data) {
		Node node =head;
		Node prev=null;
		while(node!=null && node.data != data ) {
			prev=node;
			node=node.next;
		}
		prev.next=node.next;
	}
	public void deleteNodeAtPosition(int position) {
		Node node =head;
		if(position==0) {
			head=head.next;
			return;
		}
		for(int i =0 ;i<position-1 && node!=null ;i++) {
			node = node.next;
		}
		if(node==null) {
			System.out.println("Error while deleting node - node does not exists");
			return;
		}
		Node next = node.next.next;
		node.next = next;
		
	}
	
	public void deleteList() {
		head=null;
	}
	
	public int getLengthOfList() {
		return getListLength(head);
	}
	
	private int getListLength(Node node) {
		if(node == null) {
			return 0;
		}
		return 1 + getListLength(node.next);
	}
	
	public int searchNode(int data) {
		return getNodeIndex(head,data,0);
	}
	
	private int getNodeIndex(Node node, int data, int position) {
		if(node.data==data) {
			return position;
		}
		return getNodeIndex(node.next,data,position+1);
	}
	
	public int getNthNode(int position) {
		Node node = head;
		int i=0;
		while(node!=null) {
			if(i==position) {
				return node.data;
			}
			node = node.next;
			i++;
		}
		return -1;
	}
	
	public int getNthNodeFromEnd(int position) {
		Node node = head;
		int i=0;
		while(node!=null) {
			node = node.next;
			i++;
		}
		if(i<position) {
			return -1;
		}
		node = head;
		for (int j = 0; j < i - position ; j++)
			node = node.next;
		return node.data;
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
		System.out.println("After Deleting");
		list.deleteNode(3);
		list.printList();
		System.out.println("After Deleting At Position 3 ");
		list.deleteNodeAtPosition(2);
		list.printList();
		System.out.println("After Deleting At Position 43 ");
		list.deleteNodeAtPosition(43);
		list.printList();
		System.out.println("Length of list : "+list.getLengthOfList());
		System.out.println("Position for 5 in list : "+list.searchNode(5));
		System.out.println("get 1st node : "+list.getNthNode(1));
		System.out.println("get 2nd node from end : "+list.getNthNodeFromEnd(2));
		System.out.println("List Deleted ");
		list.deleteList();
		list.printList();
	}

}
