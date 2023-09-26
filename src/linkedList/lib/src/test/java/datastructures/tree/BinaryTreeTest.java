package datastructures.tree;
import dataStructures.tree.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class BinaryTreeTest {

    @Test
    void test_Find_Max_value_BinaryTree(){
        BinaryTree tree = new BinaryTree(2);
        tree.root.leftNode = new Node(7);
        tree.root.rightNode = new Node(5);
        tree.root.leftNode.rightNode = new Node(6);
        tree.root.leftNode.rightNode.leftNode = new Node(1);
        tree.root.leftNode.rightNode.rightNode = new Node(11);
        tree.root.rightNode.rightNode = new Node(9);
        tree.root.rightNode.rightNode.leftNode = new Node(4);

        int actualValue = tree.findMaximumValue(tree.root);
        assertEquals(11 , actualValue);
    }

    @Test
    void test_Find_Max_value_BinaryTree_EmptyTree(){
        BinaryTree tree = new BinaryTree();

        assertEquals(Integer.MIN_VALUE , tree.findMaximumValue(tree.root) );
    }
    @Test
    void testBreadthFirst() throws Exception {
        BinaryTree tree1 = new BinaryTree(1);
        tree1.root.leftNode = new Node(2);
        tree1.root.rightNode = new Node(3);
        tree1.root.leftNode.leftNode = new Node(4);
        tree1.root.leftNode.rightNode = new Node(5);
        tree1.root.rightNode.leftNode = new Node(6);
        tree1.root.rightNode.rightNode = new Node(7);
        List<Integer> result1 = tree1.breadthFirst(tree1.root);
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7), result1);
    }
    //================================== K-ary tree ======================
    @Test
    public void testFizzBuzzTreeWithDivisibleValues() {
        KaryNode root = new KaryNode("15");
        root.childrenNodes.add(new KaryNode("3"));
        root.childrenNodes.add(new KaryNode("5"));
        root.childrenNodes.add(new KaryNode("7"));

        KaryNode newRoot = FizzBuzzTree.fizzBuzzTree(root);

        assertEquals("FizzBuzz", newRoot.value);
        assertEquals("Fizz", newRoot.childrenNodes.get(0).value);
        assertEquals("Buzz", newRoot.childrenNodes.get(1).value);
        assertEquals("7", newRoot.childrenNodes.get(2).value);
    }

    @Test
    public void testFizzBuzzTreeWithSingleValue() {
        KaryNode root = new KaryNode("3");

        KaryNode newRoot = FizzBuzzTree.fizzBuzzTree(root);

        assertEquals("Fizz", newRoot.value);
    }
}
