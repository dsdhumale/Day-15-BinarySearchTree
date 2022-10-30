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
	}

}
