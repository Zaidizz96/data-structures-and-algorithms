package dataStructures.treeIntersection;

import dataStructures.tree.BinaryTree;
import dataStructures.tree.Node;

public class Driver {
    public static void main(String[] args) throws Exception {
        BinaryTree binaryTree1 = new BinaryTree(1);
        binaryTree1.root.leftNode = new Node(2);
        binaryTree1.root.rightNode = new Node(3);
        binaryTree1.root.leftNode.leftNode = new Node(17);
        binaryTree1.root.leftNode.rightNode = new Node(5);
        binaryTree1.root.rightNode.leftNode = new Node(6);
        binaryTree1.root.rightNode.rightNode = new Node(7);

        BinaryTree binaryTree2 = new BinaryTree(3);
        binaryTree2.root.leftNode = new Node(2);
        binaryTree2.root.rightNode = new Node(4);
        binaryTree2.root.leftNode.leftNode = new Node(5);
        binaryTree2.root.leftNode.rightNode = new Node(9);
        binaryTree2.root.rightNode.leftNode = new Node(18);
        binaryTree2.root.rightNode.rightNode = new Node(20);

        System.out.println(TreeIntersection.tree_intersection(binaryTree1 , binaryTree2));
    }
}
