package dataStructures.linkedList;

import java.util.StringJoiner;

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(4);
        linkedList.insert(7);
        System.out.println(linkedList.toString());
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void insert(int value){
        Node node = new Node(value);
        if (isEmpty()){
            head = node;
        }else {
            node.setNext(head);
            head=node;
        }
    }

    public boolean include(int value) {
        Node curr = head;
        if (isEmpty()) {
            System.out.println("THE LIST IS EMPTY");
        } else {
            while (curr != null) {
                if (curr.getData() == value) {
                    return true;
                }
                curr.getNext();
            }
        }
        return false;

    }

    @Override
    public String toString(){
        Node curr = head;

        StringJoiner stringy = new StringJoiner(", ");

        while (curr != null){
            //System.out.println(curr.value);
            Integer currentValue = curr.getData();

            stringy.add(currentValue.toString());

            curr = curr.getNext();
        }
        //System.out.println(curr.value);
        return stringy.toString();
    }
}
