package datastructures.tree;

import dataStructures.tree.BinarySearchTree;
import dataStructures.tree.BinaryTree;
import dataStructures.tree.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    @Test
    void test_Instantiate_Empty_Tree(){
        BinaryTree binaryTree = new BinaryTree(6);
        assertNotNull(binaryTree);
        assertNull(binaryTree.root.getLeftNode());
    }

    @Test
    void test_Instantiate_With_SingleRoot(){
        BinaryTree binaryTree = new BinaryTree(6);
        assertEquals(6 , binaryTree.root.getValue());
    }

    @Test
    void test_Add_Properly_Values_At_Position(){
        BinarySearchTree binarySearchTree = new BinarySearchTree(7);
        binarySearchTree.add(6);
        binarySearchTree.add(8);

        int left = binarySearchTree.root.leftNode.value;
        int right  = binarySearchTree.root.rightNode.value;

       assertEquals(left , 6);
    }

    @Test
    void check_Return_Collection(){
        BinaryTree binaryTree = new BinaryTree(7);
        binaryTree.root.leftNode = new Node(5);
        binaryTree.root.rightNode = new Node(8);
        binaryTree.root.leftNode.leftNode = new Node(3);
        binaryTree.root.leftNode.rightNode = new Node(7);
        binaryTree.root.rightNode.leftNode = new Node(12);
        binaryTree.root.rightNode.rightNode = new Node(15);

        String preorderExpected = "{ 7 } -> { 5 } -> { 3 } -> { 7 } -> { 8 } -> { 12 } -> { 15 } -> NULL";
        String inorderExpected = "{ 3 } -> { 5 } -> { 7 } -> { 7 } -> { 12 } -> { 8 } -> { 15 } -> NULL";
        String postOrderExpected = "{ 3 } -> { 7 } -> { 5 } -> { 12 } -> { 15 } -> { 8 } -> { 7 } -> NULL";

        assertEquals(preorderExpected , binaryTree.preorderTraversal().toString());
        assertEquals(inorderExpected , binaryTree.inorderTraversal().toString());
        assertEquals(postOrderExpected , binaryTree.postorderTraversal().toString());
    }
    @Test
    void test_Contains_Methods(){
        BinarySearchTree binarySearchTree = new BinarySearchTree(10);
        binarySearchTree.add(4);
        binarySearchTree.add(7);

        assertTrue(binarySearchTree.contains(4));
    }

}
