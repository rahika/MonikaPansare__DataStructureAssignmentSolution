package com.datastructure.assignmentquestion2;

public class Driver {
	
	static RightSkewedBinarySearchTree rsbt = new RightSkewedBinarySearchTree();
	

	public static void main(String[] args) {
		RightSkewedBinarySearchTree.Node node = new RightSkewedBinarySearchTree.Node(50);
        node.left = new RightSkewedBinarySearchTree.Node(30);
        node.right = new RightSkewedBinarySearchTree.Node(60);
        node.left.left = new RightSkewedBinarySearchTree.Node(10);
        node.right.left = new RightSkewedBinarySearchTree.Node(55);

        rsbt.rightSkewedTree(node);
        rsbt.printTree(rsbt.getRootnode());

	}

}
