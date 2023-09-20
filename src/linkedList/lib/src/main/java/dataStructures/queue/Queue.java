package dataStructures.queue;

import dataStructures.sharedNode.Node;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;


public class Queue<T> {
    private Node<T> front;
    private Node<T> back;

    public Queue() {
        front = null;
        back = null;
    }

    public boolean isEmpty() {
        return (front == null && back == null);
    }

    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            front = node;
        } else {
            back.setNext(node);
        }
        back = node;
    }


    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        T dequeuedItem = front.getData();
        front = front.getNext();

        // If front becomes null, set back to null as well to keep the queue consistent
        if (front == null) {
            back = null;
        }

        return dequeuedItem;
    }



    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("The Queue is Empty");
        }
        return front.getData();
    }

    public String print() {
        StringBuilder values = new StringBuilder();

        if (!isEmpty()) {
            Node<T> curr = front;
            while (curr != back.getNext()) {
                if (curr == back) {
                    values.append(curr.getData());
                    return values.toString();
                }
                values.append(curr.getData()).append(" , ");
                curr = curr.getNext();
            }
        }
        return values.toString();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(4);
        System.out.println(queue.print());
    }
}
