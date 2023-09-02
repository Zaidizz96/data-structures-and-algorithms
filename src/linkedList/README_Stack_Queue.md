# Stack and Queue Implementation with Linked List

## Description

In this lab, we will implement a Stack and Queue data structure using a Linked List as the underlying data storage mechanism. Both the Stack and Queue will have methods for adding, removing, and checking elements.

## Whiteboard Process
![Whiteboard Image](../../assets/Stack%20and%20Queue.png)

## Approach & Efficiency

### Stack

For the Stack implementation in Java:
- We use a singly Linked List to store the elements.
- The `push` method adds a new node with the given value to the top of the stack in O(1) time.
- The `pop` method removes and returns the value from the top of the stack in O(1) time. It raises an exception when called on an empty stack.
- The `peek` method returns the value of the node at the top of the stack without removing it. It also raises an exception when called on an empty stack.
- The `is_empty` method checks if the stack is empty and returns a Boolean value.

### Queue

For the Queue implementation in Java:
- We use a singly Linked List to store the elements.
- The `enqueue` method adds a new node with the given value to the back of the queue in O(1) time.
- The `dequeue` method removes and returns the value from the front of the queue in O(1) time. It raises an exception when called on an empty queue.
- The `peek` method returns the value of the node at the front of the queue without removing it. It also raises an exception when called on an empty queue.
- The `is_empty` method checks if the queue is empty and returns a Boolean value.

## Solution

To run the code and see examples of it in action, follow these steps:

1. Ensure you have the Node and Linked List classes available in Java.
2. Create instances of the Stack and Queue classes.
3. Use the provided methods (`push`, `pop`, `peek`, `is_empty` for Stack, and `enqueue`, `dequeue`, `peek`, `is_empty` for Queue) to perform operations on the data structures.

Here's an example of how to use the Stack and Queue in Java:

```java
public class Main {
    public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the Stack
        System.out.println(stack.pop());  // Output: 3
        System.out.println(stack.pop());  // Output: 2

        // Check if the Stack is empty
        System.out.println(stack.is_empty());  // Output: false

        // Peek at the top element of the Stack
        System.out.println(stack.peek());  // Output: 1

        // Create a Queue
        Queue<Integer> queue = new Queue<>();

        // Enqueue elements into the Queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Dequeue elements from the Queue
        System.out.println(queue.dequeue());  // Output: 10
        System.out.println(queue.dequeue());  // Output: 20

        // Check if the Queue is empty
        System.out.println(queue.is_empty());  // Output: false

        // Peek at the front element of the Queue
        System.out.println(queue.peek());  // Output: 30
    }
}
