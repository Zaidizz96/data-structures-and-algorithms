package dataStructures.tree;

import java.util.ArrayList;
import java.util.List;

public class KaryNode {
    String value;
    List<KaryNode> childrenNodes;

    public KaryNode(String value) {
        this.value = value;
        this.childrenNodes = new ArrayList<>();
    }
}
