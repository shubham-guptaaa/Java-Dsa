public class sizeMaxHeightSum {
    public static class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;

        }
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static int size(Node root){
        if(root==null) return 0;
        int count = 1 + size(root.left)+size(root.right);
        return count;
    }
    public static int Sum(Node root){
        if(root == null) return 0;
        int sum = root.val + Sum(root.left) + Sum(root.right);
        return sum;
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b,c));
    }
    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
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
        preorder(root);
        System.out.println();
        System.out.println("Size of tree:- "+size(root));
        System.out.println("Sum of the value of Nodes of the Tres is :- "+Sum(root));
        System.out.println("Maximum value in tree is :- "+max(root));
        System.out.println("Height of tree is :- "+height(root));
    }
}
