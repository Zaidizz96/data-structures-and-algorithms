# LinkedList and Nodes
## Description
This coding challenge involves implementing a linked list data structure with a Node class and a Linked List class. The Linked List class provides methods for inserting nodes at the head, checking if a value exists, and converting the linked list to a string.
## Whiteboard Process

![Whiteboard Image](../../assets/zip%20linked%20list%20code%20challange%20white%20board.png)
## Approach & Efficiency
I built a linked list step by step. Each "node" in the list held a value and knew about the next node. The list itself started with a "head" that pointed to the first node. Adding new nodes was super quick, as they were added at the beginning ("head") of the list in constant time—O(1)
## Classes:
### Node Class
- #### Properties:
  - value: The value stored in the Node.
  - next: A pointer to the next Node.
  
 ### Linked List Class
 - #### Properties:
   - head: Points to the first node in the linked list.
   - size: return the size of linked list instantiated.

- #### Methods:

  - insert(value): Adds a new node with the given value to the head of the linked list.
  - includes(value): Checks if a node with the given value exists in the linked list.
  - append(vlaue):add new value to the end of linked list
  - insertBefore(value , newValue): add new value before the node with specific given value 
  - insertAfter(value , newValue): add new value after the node with specified given value.
  - to_string(): Converts the linked list to a formatted string.
  - kth-from-end(): Return the node’s value that is k places from the tail of the linked list.
  - merge(LinkedList linkedList): Return: New Linked List, Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the the zipped list.
- #### Testing

- test verifies that a newly created LinkedList object is indeed empty by checking if the head node is null.
- test confirms that the include method accurately detects the presence of a specific element in the linked list.
- test is to ensure that the insert method properly adds elements to the linked list.
- test evaluates the correctness of the toString method, which should return a formatted string representation of the linked list
- Can successfully add a node to the end of the linked list
- Can successfully add multiple nodes to the end of a linked list
- Can successfully insert a node before a node located i the middle of a linked list
- Can successfully insert a node after the last node of the linked list
- can successfully throws a runtime exception if kth-value is (greater than size of linked list or less than 0)
- can successfully return the node's value that is k places from the tail of the linked list.
- can successfully return the node's value of size 1 linked list.
- can successfully return Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the the zipped list.
- can successfully zipped between two linked lists with different length 