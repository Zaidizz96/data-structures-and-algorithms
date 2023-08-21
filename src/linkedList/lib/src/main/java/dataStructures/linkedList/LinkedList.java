package dataStructures.linkedList;

public class LinkedList {

    private  Node head;


    public LinkedList() {
        head = null;

    }

    public Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        System.out.println(linkedList.toString());


    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void append(Integer value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
        } else {
            Node tempNode = head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(node);
        }
    }

    public void insertBefore(Integer value, Integer newValue) {
        Node node = new Node(newValue);
        Node tempNode = head;
        if(head.getData() == value){
            node.setNext(head);
            head = node;
        }
        while(tempNode.getNext() != null && tempNode.getNext().getData() != value){
            tempNode = tempNode.getNext();
        }
        if(tempNode.getNext() != null){
            Node leader = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(leader);
        }

}

public void insertAfter(Integer value , Integer newValue){
        Node node = new Node(newValue);
        Node tempNode = head;
    while(tempNode.getNext() != null && tempNode.getData() != value) {
        tempNode = tempNode.getNext();
    }
        node.setNext(tempNode.getNext());
        tempNode.setNext(node);
}

    public void insert(Integer value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
        } else {
            node.setNext(head);
            head = node;
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
                curr = curr.getNext();
            }
        }
        return false;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");

        Node current = head;
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
}

//    @Override
//    public String toString(){
//        Node curr = head;
//
//        StringJoiner stringy = new StringJoiner(", ");
//
//        while (curr != null){
//            //System.out.println(curr.value);
//            Integer currentValue = curr.getData();
//
//            stringy.add(currentValue.toString());
//
//            curr = curr.getNext();
//        }
//        //System.out.println(curr.value);
//        return stringy.toString();
//    }

