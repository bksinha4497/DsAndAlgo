package com.bk.gfg.ds.linked.list.singly;

import java.util.HashSet;

public class IntersectPointTwoList {

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

	public Node intersectionPoint() {
        Node n1 = a;
        Node n2 = b;
        HashSet<Node> hs = new HashSet<Node>();
        while (n1 != null) {
            hs.add(n1);
            n1 = n1.next;
        }
        while (n2 != null) {
            if (hs.contains(n2)) {
                return n2;
            }
            n2 = n2.next;
        }
        return null;
	}
	
	public void printNode(Node node) {
		Node cur = node;
		while(cur!=null) {
			System.out.println(cur.data);
			cur=cur.next;
		}
	}

	public static void main(String[] args) {
		IntersectPointTwoList list = new IntersectPointTwoList();
		  
        list.a = new Node(1);
        list.a.next = new Node(2);
        list.a.next.next = new Node(3);
        list.a.next.next.next = new Node(4);
        list.a.next.next.next.next = new Node(6);
 
        list.b = new Node(5);
        list.b.next = new Node(6);
        list.b.next.next = list.a.next;
        list.b.next.next.next = new Node(8);
        System.out.println(list.intersectionPoint().data);
	}
}
