package com.Bridgelabz.BinarySearchTree;

public class BinarySearchTreeMain {
	public static void main(String[] args) {
		System.out.println("Welcome in Binary Search Tree program");
		BinarySearchTree tree = new BinarySearchTree();
		// Add node to binary tree
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);

		System.out.println("\nBinary search tree after insertion of element");

		// Display the binary tree
		tree.inorderDisplay(tree.root);
		tree.insert(22);
		tree.insert(40);
		tree.insert(60);
		tree.insert(95);
		tree.insert(65);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.insert(63);
		tree.insert(67);

		System.out.println("\n\nBinary search tree after insertion more element");

		// Display the binary tree
		tree.inorderDisplay(tree.root);
	}
}
