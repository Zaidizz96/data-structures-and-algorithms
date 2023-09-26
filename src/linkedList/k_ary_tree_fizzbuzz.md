# K-ary Tree FizzBuzz

## Description
This challenge involves extending the binary tree and binary search tree classes to handle k-ary trees and applying the FizzBuzz transformation to the nodes of the tree. A k-ary tree is a tree data structure where each node can have up to k children.

## Whiteboard Process
![Whiteboard Image](../../assets/Whiteboard-k-ary%20tree%20(fizz%20buzz).png)


## Approach & Efficiency
- We extended the binary tree class to create a k-ary tree class, implementing the necessary methods to work with a k-ary structure.
- The FizzBuzz transformation was applied to the nodes of the k-ary tree, replacing node values with "Fizz," "Buzz," "FizzBuzz," or integers based on divisibility criteria.

### Big O Analysis
- The time complexity for applying the FizzBuzz transformation to a k-ary tree is O(n), where n is the number of nodes in the tree. This operation traverses each node once.
- The space complexity is O(h) due to the recursion stack used during traversal, where h is the height of the k-ary tree.

## Methods

### K-ary Tree Methods
- `fizzBuzzTree`: Apply the FizzBuzz transformation to the k-ary tree, creating a new tree with modified values.

## Usage
To use the k-ary tree FizzBuzz transformation, follow these steps:

```java
KaryTreeNode root = new KaryTreeNode("15"); // Create a k-ary tree
// Add child nodes as needed

KaryTreeNode newRoot = FizzBuzzTree.fizzBuzzTree(root); // Apply FizzBuzz transformation

// The resulting 'newRoot' contains the modified k-ary tree.
