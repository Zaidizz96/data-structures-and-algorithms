package dataStructures.treeIntersection;

import dataStructures.hashtables.HashMap;
import dataStructures.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

    public static List<Integer> tree_intersection(BinaryTree tree1 , BinaryTree tree2 ) throws Exception {
        HashMap<Integer , Boolean> hashMap = new HashMap<>(10);
        List<Integer> listContainsMatchedNumber = new ArrayList<>();

       List<Integer> treeList1 = tree1.breadthFirst(tree1.root);
       treeList1.forEach(e -> hashMap.set(e , true));

       List<Integer> treeList2 = tree2.breadthFirst(tree2.root);
       treeList2.forEach(e -> {
           if (hashMap.has(e)) {
            listContainsMatchedNumber.add(e);
           }
       });
        return listContainsMatchedNumber;
    }
}
