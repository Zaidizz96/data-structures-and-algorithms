package dataStructures.sharedNode;

public class Node {

    private Node next;
    private Integer data;

    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

}
