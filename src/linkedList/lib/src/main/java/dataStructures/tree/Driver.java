package dataStructures.tree;

import dataStructures.linkedList.LinkedList;

public class Driver {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(7);
        binaryTree.root.leftNode = new Node(5);
        binaryTree.root.rightNode = new Node(8);
        binaryTree.root.leftNode.leftNode = new Node(3);
        binaryTree.root.leftNode.rightNode = new Node(7);
        binaryTree.root.rightNode.leftNode = new Node(12);
        binaryTree.root.rightNode.rightNode = new Node(15);
        System.out.println(binaryTree.preorderTraversal());
        System.out.println(binaryTree.inorderTraversal());
        System.out.println(binaryTree.postorderTraversal());


        BinarySearchTree binarySearchTree = new BinarySearchTree(7);
        binarySearchTree.add(4);
        binarySearchTree.add(7);
        binarySearchTree.add(3);
        binarySearchTree.add(9);
        binarySearchTree.add(1);

        System.out.println(binarySearchTree.contains(5));

        // ================================

        BinaryTree tree = new BinaryTree(2);
        tree.root.leftNode = new Node(7);
        tree.root.rightNode = new Node(5);
        tree.root.leftNode.rightNode = new Node(6);
        tree.root.leftNode.rightNode.leftNode = new Node(1);
        tree.root.leftNode.rightNode.rightNode = new Node(11);
        tree.root.rightNode.rightNode = new Node(9);
        tree.root.rightNode.rightNode.leftNode = new Node(4);


        System.out.println("Maximum element is "
                + tree.findMaximumValue(tree.root));


        // ======================================


    }



}
