package dataStructures.pseudoQueue;

import dataStructures.queue.Queue;
import dataStructures.stack.Stack;

public class PseudoQueue implements PseudoQueueInterFace {

    public Stack stack1, stack2;

    public PseudoQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public static void push(Stack topStack, int value) {
        topStack.push(value);
    }

    public static int pop(Stack topStack) {
        if (topStack.isEmpty()) {
            return -1;
        }
        return topStack.pop();
    }

    @Override
    public void enqueue(PseudoQueue queue, int value) {
        queue.stack1.push(value);
    }

    @Override
    public int dequeue(PseudoQueue queue) {
        int popedNumber;
        if (queue.stack1.isEmpty() && queue.stack2.isEmpty()){
            return -1;
        }
        if (queue.stack2.isEmpty()){
            while (!queue.stack1.isEmpty()){
                popedNumber = pop(queue.stack1);
                queue.stack2.push(popedNumber);
            }
        }
        popedNumber = queue.stack2.pop();
        return popedNumber;
    }
}
