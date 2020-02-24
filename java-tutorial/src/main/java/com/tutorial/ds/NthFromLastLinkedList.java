package com.tutorial.ds;

public class NthFromLastLinkedList {

	static int counter = 0;
	static Node result=null;

	public static void main(String[] args) {
		Node head = new Node(1);
		Node cll2 = new Node(2);
		Node cll3 = new Node(3);
		Node cll4 = new Node(4);
		Node cll5 = new Node(5);
		Node cll6 = new Node(6);
		head.setNext(cll2);
		cll2.setNext(cll3);
		cll3.setNext(cll4);
		cll4.setNext(cll5);
		cll5.setNext(cll6);
		cll6.setNext(null);
		int n = 3;// nth from last
		Node nthFromLast = nthFromLast(head, n);
		System.out.println(nthFromLast);
	}

	private static Node nthFromLast(Node head, int n) {

		if (head != null) {
			nthFromLast(head.getNext(), n);
			counter++;
			if (counter == n) {
				result=head;
				return result;
			}
		}
		return result;

	}

}
