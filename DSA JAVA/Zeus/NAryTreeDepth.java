package Zeus;
import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}

public class NAryTreeDepth {
    public int maxDepth(Node root) {
        if (root == null) {  // no root node is present , tree is em
            return 0;
        }
        int maxChildDepth = 0;
        if (root.children != null) {
            for (Node child : root.children) {
                maxChildDepth = Math.max(maxChildDepth, maxDepth(child));
            }
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

        NAryTreeDepth naryTreeMaxDepth = new NAryTreeDepth();
        int depth = naryTreeMaxDepth.maxDepth(root);
        System.out.println("Maximum depth of the N-ary tree: " + depth); // Output should be 3
    }
}
