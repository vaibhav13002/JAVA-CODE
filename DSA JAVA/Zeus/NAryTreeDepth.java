package Zeus;
import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() { // default constructor
    }

    public Node(int val) { // constructor to initialize node with given paramaeters(Values)
        this.val = val;
    }

    public Node(int val, List<Node> children) { // initialize node with given values and list of childrens
        this.val = val;
        this.children = children;
    }
}

public class NAryTreeDepth {
    public static int maxDepth(Node root) {
        if (root == null) {  // no root node is present , tree is empty
            return 0;
        }
        int maxChildDepth = 0;
        if (root.children != null) {
            for (Node child : root.children) {
                maxChildDepth = Math.max(maxChildDepth, maxDepth(child)); // 1+max(p2,p3,p4) 1+(p2) 1+(0) 1+(0)
            }                                                           //                   1+max(1,1)
        }
        return 1 + maxChildDepth;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.children = new ArrayList<>();
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(4));

        root.children.get(0).children = new ArrayList<>();
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        // NAryTreeDepth naryTreeMaxDepth = new NAryTreeDepth();
        // int depth = naryTreeMaxDepth.maxDepth(root);
        int depth = NAryTreeDepth.maxDepth(root);
        System.out.println("Maximum depth of the N-ary tree: " + depth); // Output should be 3
    }
}
