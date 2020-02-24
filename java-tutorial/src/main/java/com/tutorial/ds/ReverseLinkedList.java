package com.tutorial.ds;

public class ReverseLinkedList {
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

		Node reversedHead = reverseLinkedList(head);
		display(reversedHead);

	}

	private static void display(Node head) {
		while (head != null) {
			System.out.println(head);
			head = head.getNext();
		}
	}

	private static Node reverseLinkedList(Node head) {

		// we will need 3 pointers previous,current and next

		Node previous = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}
		return previous;
	}

}
