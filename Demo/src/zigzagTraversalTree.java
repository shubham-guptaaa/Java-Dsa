class zigzagTraversalTree{
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void nthLevelLeft(Node root, int n){
        if(root==null) return;
        if(n==1) System.out.print(root.val+" ");
        nthLevelLeft(root.left, n-1);
        nthLevelLeft(root.right, n-1);
    }
    public static void nthLevelRight(Node root, int n){
        if(root==null) return;
        if(n==1) System.out.print(root.val+" ");
        nthLevelRight(root.right, n-1);
        nthLevelRight(root.left, n-1);
    }
    public static int height(Node root){
        if(root==null || root.left == null && root.right==null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));

    }
    public static void main(String[] args){
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
        int h = height(root);
        for(int i = 1; i <= h + 1; i++){
            if(i%2!=0) nthLevelLeft(root, i);
            else nthLevelRight(root, i);
        }
    }
}