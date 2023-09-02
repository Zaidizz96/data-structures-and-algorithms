package dataStructures.stack;

import dataStructures.sharedNode.Node;

public class Stack {
    private Node top;
    public int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(6);
        stack.push(1);
        stack.pop();
        System.out.println(stack.print());
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(int value){
        Node node = new Node(value);
            node.setNext(top);
            top = node;
            size++;
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("The Stack is Empty");
        }
        int result = top.getData();
        top = top.getNext();
        size --;
        return result;
    }
    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("The Stack is Empty");
        }
        return top.getData();
    }
    public String print(){
        StringBuilder values = new StringBuilder();
        Node curr = top;
        while (curr != null){
            if (curr.getNext() == null){
                values.append(curr.getData());
                return values.toString();
            }
                values.append(curr.getData()).append(" , ");
                curr = curr.getNext();
        }
        return values.toString();
    }

    public int getSize() {
        return size;
    }

}
