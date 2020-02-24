package com.tutorial.ds;

public class LoopDetectionInLinkedList {
	public static void main(String[] args) {
		Node head = new Node(1);
		Node cll2 = new Node(2);
		Node cll3 = new Node(3);
		Node cll4 = new Node(4);
		Node cll5 = new Node(5);
		Node cll6 = new Node(6);
		Node cll7 = new Node(7);
		Node cll8 = new Node(8);
		Node cll9 = new Node(9);
		head.setNext(cll2);
		cll2.setNext(cll3);
		cll3.setNext(cll4);
		cll4.setNext(cll5);
		cll5.setNext(cll6);
		cll6.setNext(cll7);
		cll7.setNext(cll8);
		cll8.setNext(cll9);
		cll9.setNext(cll5);
		boolean loopDetected = detectLoop(head);
		System.out.println(loopDetected);

	}

	private static boolean detectLoop(Node head) {
		boolean loopDetected = false;
		Node slowPtr = head;
		Node fastPtr = head;
		Node startNodeOfLoop = null;
		int lenghtOfLoop = 0;
		while (null != slowPtr.getNext() && null != fastPtr.getNext()) {
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if (slowPtr.equals(fastPtr)) {
				loopDetected = true;
				break;
			}

		}

		if (loopDetected)

		{
			// find start node of loop
			slowPtr = head;
			while (!slowPtr.equals(fastPtr)) {
				slowPtr = slowPtr.getNext();
				fastPtr=fastPtr.getNext();
			}
			startNodeOfLoop = slowPtr;
			System.out.println("Start node of loop :" + startNodeOfLoop);
			System.out.println("Length of loop :" + lenghtOfLoop);
			// find length of loop
		}
		return loopDetected;

	}

}
