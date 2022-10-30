package com.Bridgelabz.BinarySearchTree;

public class BinarySearchTree {
	Node root;

// MMethod to add data in tree
	public void insert(int data) {
		Node node = new Node(data);
		node.data = data;
		node.left = null;
		node.right = null;

		if (root == null) {
			root = node;
			return;
		} else {
			Node parent = root;
			Node current = root;
			while (current != null) {
				parent = current;
				if (node.data > current.data) {
					current = current.right;
				} else {
					current = current.left;
				}
			}
			if (node.data > parent.data) {
				parent.right = node;
			} else {
				parent.left = node;
			}
		}
	}

// Method to display data of tree
	public void inorderDisplay(Node node) {
		if (node.left != null) {
			inorderDisplay(node.left);
		}

		System.out.print(node.data + " ");

		if (node.right != null) {
			inorderDisplay(node.right);
		}
	}
}


