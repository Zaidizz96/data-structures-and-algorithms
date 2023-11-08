package datastructures.tree_intersection;
import dataStructures.tree.BinaryTree;
import dataStructures.tree.Node;
import dataStructures.treeIntersection.TreeIntersection;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class TreeIntersectionTest {

    @Test
    void test_Intersection_With_Two_Common_Values() throws Exception {
        BinaryTree tree1 = new BinaryTree(1);
        tree1.root.leftNode = new Node(2);
        tree1.root.rightNode = new Node(3);

        BinaryTree tree2 = new BinaryTree(3);
        tree2.root.leftNode = new Node(2);
        tree2.root.rightNode = new Node(4);

        List<Integer> result = TreeIntersection.tree_intersection(tree1, tree2);

        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertFalse(result.contains(1));
        assertFalse(result.contains(4));
    }

    @Test
    void test_Intersection_With_No_Common_Values() throws Exception {
        BinaryTree tree1 = new BinaryTree(1);
        tree1.root.leftNode = new Node(2);
        tree1.root.rightNode = new Node(3);

        BinaryTree tree2 = new BinaryTree(4);
        tree2.root.leftNode = new Node(5);
        tree2.root.rightNode = new Node(6);

        List<Integer> result = TreeIntersection.tree_intersection(tree1, tree2);

        assertTrue(result.isEmpty());
    }

}

