package dataStructures.linkedList;

public class LinkedList {

    private static Node head;

    public LinkedList() {
        head = null;
    }
    public Node getHead(){
        return head;
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(4);
        linkedList.insert(7);
        linkedList.insert(8);
        linkedList.insert(10);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.include(7));
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void insert(Integer value){
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

