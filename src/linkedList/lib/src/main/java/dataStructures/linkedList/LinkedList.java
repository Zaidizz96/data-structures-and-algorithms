package dataStructures.linkedList;

import dataStructures.sharedNode.Node;

public class LinkedList<T> {

    private Node<T> head;
    private int size;

    public static void main(String[] args) {
        try {
            LinkedList<Integer> linkedList = new LinkedList<>();
            LinkedList<Integer> list1 = new LinkedList<>();
            list1.append(1);
            list1.append(3);
            list1.append(2);

            LinkedList<Integer> list2 = new LinkedList<>();
            list2.append(5);
            list2.append(9);
            list2.append(4);
            list2.append(7);
            list2.append(6);

            System.out.println(linkedList.zipLists(list1, list2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void merge(LinkedList<T> l1) {
        Node<T> p_curr = head, q_curr = l1.head;
        Node<T> p_next, q_next;

        while (p_curr != null && q_curr != null) {
            p_next = p_curr.getNext();
            q_next = q_curr.getNext();

            q_curr.setNext(p_next);
            p_curr.setNext(q_curr);

            p_curr = p_next;
            q_curr = q_next;
        }
        while (p_curr != null) {
            l1.append(p_curr.getData());
            p_curr = p_curr.getNext();
        }

        while (q_curr != null) {
            l1.append(q_curr.getData());
            q_curr = q_curr.getNext();
        }
        l1.head = q_curr;
    }

    public LinkedList() {
        head = null;
        size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public String kth_from_end(int k) {
        Node<T> tempNode = head;
        int count = 1;
        T value = null;
        if (size < k) {
            throw new RuntimeException("k is greater than the size of the list");
        }
        if (k < 0) {
            throw new RuntimeException("k cannot be a negative number");
        }
        if ((size - k) <= 0) {
            if (tempNode != null) {
                value = tempNode.getData();
            }
            return "the value is: " + value;
        }
        while ((tempNode.getNext() != null)) {
            if ((size - k) == count) {
                value = tempNode.getData();
            }
            tempNode = tempNode.getNext();
            count++;
        }
        return "the value is: " + value;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void append(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            head = node;
            size = 1;
        } else {
            Node<T> tempNode = head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(node);
            size++;
        }
    }

    public void insertBefore(T value, T newValue) {
        Node<T> node = new Node<>(newValue);
        Node<T> tempNode = head;
        if (head != null && head.getData().equals(value)) {
            node.setNext(head);
            head = node;
            size++;
            return;
        }
        while (tempNode.getNext() != null && !tempNode.getNext().getData().equals(value)) {
            tempNode = tempNode.getNext();
        }
        if (tempNode.getNext() != null) {
            Node<T> leader = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(leader);
            size++;
        }
    }

    public void insertAfter(T value, T newValue) {
        Node<T> node = new Node<>(newValue);
        Node<T> tempNode = head;
        while (tempNode != null && !tempNode.getData().equals(value)) {
            tempNode = tempNode.getNext();
        }
        if (tempNode != null) {
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
            size++;
        }
    }

    public void insert(T value) {
        Node<T> node = new Node<>(value);
        if (isEmpty()) {
            head = node;
            size = 1;
        } else {
            node.setNext(head);
            head = node;
            size++;
        }
    }

    public boolean include(T value) {
        Node<T> curr = head;
        while (curr != null) {
            if (curr.getData().equals(value)) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        Node<T> current = head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(" } -> { ");
            }
            current = current.getNext();
        }

        sb.append(" } -> NULL");
        return sb.toString();
    }

    public LinkedList<T> zipLists(LinkedList<T> linkedList1, LinkedList<T> linkedList2) {
        linkedList1.merge(linkedList2);
        return linkedList1;
    }
}
