package dataStructures.tree;

import java.util.ArrayList;
import java.util.List;

public class KaryNode {
    public  String value;
    public  List<KaryNode> childrenNodes;

    public KaryNode(String value) {
        this.value = value;
        this.childrenNodes = new ArrayList<>();
    }
}
