package com.example.logic;

import java.util.List;

public class BinaryTree {

	Node root;

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	public BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();

		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);

		return bt;
	}

	
	public String sort(List<Integer> integers) {
		BinaryTree bt = new BinaryTree();
		for (Integer integer : integers) {
			bt.add(integer);
		}

		return traversePostOrder(bt.root);
	}

	public String traversePostOrder(Node node) {
		String value = "";
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.value);
			value = String.valueOf(node.value);
		}
		return value;

	}

}
