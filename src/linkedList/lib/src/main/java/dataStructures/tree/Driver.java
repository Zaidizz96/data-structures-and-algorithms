package dataStructures.tree;

import java.util.List;

public class Driver {
    public static void main(String[] args) throws Exception {

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
        BinaryTree binaryTree1 = new BinaryTree(1);
        binaryTree1.root.leftNode = new Node(2);
        binaryTree1.root.rightNode = new Node(3);
        binaryTree1.root.leftNode.leftNode = new Node(4);
        binaryTree1.root.leftNode.rightNode = new Node(5);
        binaryTree1.root.rightNode.leftNode = new Node(6);
        binaryTree1.root.rightNode.rightNode = new Node(7);

        try {
            List<Integer> result = binaryTree1.breadthFirst(binaryTree1.root);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //=====================fizzbuzz code challanege=================
        KaryNode karyNode = new KaryNode("6");
        karyNode.childrenNodes.add(new KaryNode("8"));
        karyNode.childrenNodes.add(new KaryNode("4"));
        karyNode.childrenNodes.add(new KaryNode("6"));
        karyNode.childrenNodes.add(new KaryNode("1"));
        karyNode.childrenNodes.add(new KaryNode("10"));

        KaryNode karyNode1 = FizzBuzzTree.fizzBuzzTree(karyNode);
        FizzBuzzTree.printTree(karyNode1);
    }
}



