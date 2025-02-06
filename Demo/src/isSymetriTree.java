public class isSymetriTree {
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
    public static boolean isSameTree(Node p, Node q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static Node invertTree(Node root){
        if(root==null) return root;
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    public static boolean isSymmetric(Node root) {
        if(root==null) 
        return true;
        root.left = invertTree(root.left);
        return 
        isSameTree(root.left,root.right);
    }
     
    public static void main(String[] args) {
        Node root = new Node(1);
        Node b = new Node(2);
        Node c = new Node(2);
        root.left = b;
        root.right = c;
        Node d = new Node(3);
        Node e = new Node(4);
        b.left = d;
        b.right = e;
        Node f = new Node(4);
        Node g = new Node(3);
        c.left = f;
        c.right = g;
        System.out.println(isSymmetric(root));
    }
}
