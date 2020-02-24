package com.tutorial.ds;

public class CLLImplementer {
	public static void main(String[] args) {
		Node cllHead = new Node(1);
		Node cll2 = new Node(2);
		Node cll3 = new Node(3);
		Node cll4 = new Node(4);
		Node cll5 = new Node(5);
		Node cll6 = new Node(6);
		cllHead.setNext(cll2);
		cll2.setNext(cll3);
		cll3.setNext(cll4);
		cll4.setNext(cll5);
		cll5.setNext(cll6);
		cll6.setNext(cllHead);

		int nodeCount = countNodes(cllHead);
		System.out.println(nodeCount);

		printNodes(cllHead);

	}

	private static void printNodes(Node cllHead) {
		if (null == cllHead)
			System.out.println("List empty");
		Node currentNode = cllHead.getNext();
		System.out.println(cllHead.getData());
		while (!(cllHead.equals(currentNode))) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}

	private static int countNodes(Node cllHead) {
		if (null == cllHead)
			return 0;
		int count = 1;
		Node currentNode = cllHead.getNext();
		while (!(cllHead.equals(currentNode))) {
			count += 1;
			currentNode = currentNode.getNext();
		}
		return count;
	}

}
