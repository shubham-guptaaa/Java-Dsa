public class minNumberInTree {
    public static class Node{
        int val; 
        Node left;
        Node right;

        //Constructor
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a, Math.min(b,c));
    }
    public static void main(String[] args){
        Node root = new Node(2);
        Node b = new Node(4);
        Node c = new Node(10);
        root.left = b;
        root.right = c;
        Node d = new Node(1);
        Node e = new Node(15);
        b.left = d;
        b.right = c;
        Node f = new Node(6);
        Node g = new Node(11);
        e.left = f;
        e.right = g;
        System.out.println(min(root));

    }
}
