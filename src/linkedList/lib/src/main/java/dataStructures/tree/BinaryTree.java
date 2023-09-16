package dataStructures.tree;

import dataStructures.linkedList.LinkedList;

public class BinaryTree {
   public Node root;

    public BinaryTree(int value) {
        this.root = new Node(value);
    }

    public BinaryTree() {
    }

    public void preOrder(Node node, LinkedList linkedListTravers) {
        if (node != null) {
            linkedListTravers.append(node.value);
            preOrder(node.leftNode, linkedListTravers);
            preOrder(node.rightNode, linkedListTravers);
        }
    }
    public LinkedList preorderTraversal() {
        LinkedList traversalLinkedList= new LinkedList();
        preOrder(root, traversalLinkedList);
        return traversalLinkedList;
    }
    public void inOrder(Node node, LinkedList traversal) {
        if (node != null) {
            inOrder(node.leftNode, traversal);
            traversal.append(node.value);
            inOrder(node.rightNode, traversal);
        }
    }
    public LinkedList inorderTraversal() {
        LinkedList traversalLinkedList = new LinkedList();
        inOrder(root, traversalLinkedList);
        return traversalLinkedList;
    }
    public void postOrder(Node node, LinkedList traversal) {
        if (node != null) {
            postOrder(node.leftNode, traversal);
            postOrder(node.rightNode, traversal);
            traversal.append(node.value);
        }
    }
    public LinkedList postorderTraversal() {
        LinkedList traversalLinkedList = new LinkedList();
        postOrder(root, traversalLinkedList);
        return traversalLinkedList;
    }
}
