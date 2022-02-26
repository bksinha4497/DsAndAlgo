package com.bk.gfg.ds.linked.list.singly;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.bk.gfg.ds.linked.list.singly.SinglyLinkedList.Node;


public class SwapNodes {

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

	public void swapNodes(int x, int y) {
        if (x == y)
            return;
        
        Node prevX = null, currX = head;
        
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
        
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        
        if (currX == null || currY == null)
            return;
        
        if (prevX != null)
            prevX.next = currY;
        else 
            head = currY;
 
        if (prevY != null)
            prevY.next = currX;
        else 
            head = currX;
 
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
		
	}

	public static void main(String[] args) {
		SwapNodes list = new SwapNodes();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.printList();
		list.swapNodes(1,3);
		System.out.println("-----------");
		list.printList();
	}

}
