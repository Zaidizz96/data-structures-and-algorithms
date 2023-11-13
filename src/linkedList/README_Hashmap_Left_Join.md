# Left Join of Hashmaps

## Description
This challenge focuses on performing a left join operation on two hashmaps. It involves merging the keys and values of two hashmaps based on the left map's keys and appending values from the right map where keys match.

## Whiteboard Process
![Whiteboard Image](../../assets/code-challange33%20whiteboard.png)

## Approach & Efficiency
The approach taken involves iterating through the keys of the left hashmap, checking for matches in the right hashmap, and constructing the resulting structure accordingly. The space-time complexity of this approach is O(n) where 'n' is the number of elements in the left hashmap.

## Solution
### How to Run
1. Instantiate two HashMap objects, hashMap1 and hashMap2, using the HashMap class.
2. Populate the hash maps with key-value pairs using the set method.
3. Call the leftJoin method from the HashmapLeftJoin class, passing in the two hash maps as arguments.
4. The result variable will contain the joined data structure, providing the left join of the two hash maps.
### Example

![Whiteboard Image](../../assets/code-challange33%20(input).png)
![Whiteboard Image](../../assets/code-challange33%20(output).png)
