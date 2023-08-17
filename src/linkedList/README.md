# LinkedList and Nodes
## Description
This coding challenge involves implementing a linked list data structure with a Node class and a Linked List class. The Linked List class provides methods for inserting nodes at the head, checking if a value exists, and converting the linked list to a string.
## Whiteboard Process

![Whiteboard Image](../../assets/linked%20list%20white%20board.PNG)
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
   - Methods:

insert(value): Adds a new node with the given value to the head of the linked list.
includes(value): Checks if a node with the given value exists in the linked list.
to_string(): Converts the linked list to a formatted string.

- #### Methods:

  - insert(value): Adds a new node with the given value to the head of the linked list.
  - includes(value): Checks if a node with the given value exists in the linked list.
  - to_string(): Converts the linked list to a formatted string.


