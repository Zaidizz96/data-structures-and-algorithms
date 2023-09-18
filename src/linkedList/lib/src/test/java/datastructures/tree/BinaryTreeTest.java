package datastructures.tree;
import dataStructures.tree.BinarySearchTree;
import dataStructures.tree.BinaryTree;
import dataStructures.tree.Node;
import org.junit.jupiter.api.Test;
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
}
