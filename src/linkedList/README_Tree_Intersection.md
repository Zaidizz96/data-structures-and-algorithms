# Challenge Title
Binary Tree Intersection

## Description
This challenge involves finding the common values in two binary trees and returning them as a list.

## Whiteboard Process
![Whiteboard](../../assets/Screenshot%202023-11-08%20225038.png)

## Approach & Efficiency
The approach involves using a custom HashMap to efficiently track and compare values between two binary trees. We traverse the first tree, adding its values to the HashMap. Then, we traverse the second tree and check for the presence of each value in the HashMap.

### Approach
1. Create a custom `HashMap` (or `HashSet`) to store values from the first binary tree.
2. Traverse the first binary tree using breadth-first traversal and add its values to the `HashMap` or `HashSet`.
3. Traverse the second binary tree using breadth-first traversal.
4. For each value in the second tree, check if it exists in the `HashMap` or `HashSet`.
5. If a value exists in both trees, add it to the result list.
6. Return the list containing common values.

### Efficiency
- Time Complexity: O(N) where N is the total number of nodes in both trees. We traverse each tree once.
- Space Complexity: O(M) where M is the number of unique values in the first tree. We store these unique values in the `HashMap` or `HashSet`.

## Solution
To run the code, follow these steps:

1. Create instances of the `BinaryTree` class for the two trees.
2. Call the `tree_intersection` method from the `TreeIntersection` class, passing in the two binary trees.
3. The method will return a list of common values between the two trees.

Example:
![example input](../../assets/Screenshot%202023-11-08%20221435.png)
![example output](../../assets/Screenshot%202023-11-08%20222136.png)