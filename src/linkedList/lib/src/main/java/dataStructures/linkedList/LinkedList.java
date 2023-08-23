package dataStructures.linkedList;

public class LinkedList {

    private  Node head;
    private Integer size;


    public LinkedList() {
        head = null;
        this.size=0;

    }

    public Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        try {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);

            System.out.println(linkedList.size);
            System.out.println(linkedList.kth_from_end(1));
        }
        catch (Exception c){
            System.out.println(c.getMessage());
        }

    }
    public String kth_from_end(int k){
        Node tempNode = head;
        int count = 1;
        int value=0;
        if (size < k){
            throw new RuntimeException("not allowed (k > size)");
        }
        if(k < 0){
            throw new RuntimeException("k cannot be negative number");
        }
        if((size - k) <= 0){
           return "the value is :" + tempNode.getData();
        }
        while ((tempNode.getNext() != null)) {

            if((size - k) == count){
                value = tempNode.getData();
            }
            tempNode = tempNode.getNext();
            count ++;
        }
        return "the value is :" + value;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void append(Integer value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
            size=0;
        } else {
            Node tempNode = head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();

            }
            tempNode.setNext(node);
        }
        size++;
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

