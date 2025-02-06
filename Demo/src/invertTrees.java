class invertTrees {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;

        }
    }

    public static Node invertTree(Node root) {
        if (root == null)
            return null;
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void printTree(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        root.left = b;
        root.right = c;
        Node d = new Node(4);
        Node e = new Node(5);
        b.left = d;
        b.right = e;
        Node f = new Node(6);
        Node g = new Node(7);
        c.left = f;
        c.right = g;
        root = invertTree(root);
        printTree(root);
    }
}
