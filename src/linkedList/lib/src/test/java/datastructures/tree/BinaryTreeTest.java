package datastructures.tree;
import dataStructures.tree.BinarySearchTree;
import dataStructures.tree.BinaryTree;
import dataStructures.tree.Node;
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
}
