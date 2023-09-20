package dataStructures.tree;

import dataStructures.linkedList.LinkedList;
import dataStructures.queue.Queue;

import java.util.ArrayList;
import java.util.List;

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

    public int findMaximumValue(Node node){
        if (node == null){
            return Integer.MIN_VALUE;
        }
        int max_root = node.value;
        int left_root = findMaximumValue(node.leftNode);
        int right_root = findMaximumValue(node.rightNode);

        if (left_root > max_root){
            max_root = left_root;
        }
        if (right_root > max_root){
            max_root = right_root;
        }
        return max_root;

    }

        public List<Integer> breadthFirst(Node node) throws Exception{
        Queue<Node> queue = new Queue<>();
        List<Integer> list = new ArrayList<>();

        if (node == null){
            return list;
        }
        queue.enqueue(node);
        while (!queue.isEmpty()){
            Node curr = queue.dequeue();
            list.add(curr.value);
            if (node.leftNode != null){
                queue.enqueue(node.leftNode);
            }
            if (node.rightNode != null){
                queue.enqueue(node.rightNode);
            }
        }
        return list;
    }

    public static void main(String[] args) throws Exception {
       try {
           BinaryTree binaryTree1 = new BinaryTree(1);
           binaryTree1.root.leftNode = new Node(2);
           binaryTree1.root.rightNode = new Node(3);
           binaryTree1.root.leftNode.leftNode = new Node(4);
           binaryTree1.root.leftNode.rightNode = new Node(5);
           binaryTree1.root.rightNode.leftNode = new Node(6);
           binaryTree1.root.rightNode.rightNode = new Node(7);

           System.out.println(binaryTree1.breadthFirst(binaryTree1.root));
       }catch (Exception e){
           e.getMessage();
       }
    }

}
