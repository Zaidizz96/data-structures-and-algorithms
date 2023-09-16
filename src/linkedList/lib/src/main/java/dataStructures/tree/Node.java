package dataStructures.tree;

public class Node {
    public int value;
    public Node leftNode;
    public Node rightNode;

    public Node(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode =null;
    }

    public Node(int value, Node leftNode, Node rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }


    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }
}
