package dataStructures.pseudoQueue;

import dataStructures.stack.Stack;

public class PseudoQueue<T> implements PseudoQueueInterface<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    public PseudoQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    @Override
    public void enqueue(PseudoQueue<T> queue, T value) {
        queue.stack1.push(value);
    }

    @Override
    public T dequeue(PseudoQueue<T> queue) {
        T poppedItem;
        if (queue.stack1.isEmpty() && queue.stack2.isEmpty()) {
            throw new RuntimeException("The PseudoQueue is empty");
        }

        if (queue.stack2.isEmpty()) {
            while (!queue.stack1.isEmpty()) {
                poppedItem = queue.stack1.pop();
                queue.stack2.push(poppedItem);
            }
        }

        return queue.stack2.pop();
    }
}
