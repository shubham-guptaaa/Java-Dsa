public class lowestCommonAnchestors {
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
    public static boolean isConatins(Node root, Node node){
        if(root==null) return false;
        if(root==node) return true;
        return isConatins(root.left, node) || isConatins(root.right, node);
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q){
        if(p==q) return p;
        if(p==root&&q==root) return root;
        boolean left = isConatins(root.left, p);
        boolean right = isConatins(root.right, q);
        if(p==root&&q==root || p==root || q==root) return root;
        if(left && !right)
        return lowestCommonAncestor(root.left, p, q);
        if(!left && right)
        return lowestCommonAncestor(root.right, p, q);
        return root;

    }
    public static void main(String[] args) {
        //[3,5,1,6,2,0,8,null,null,7,4]
        Node root = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        root.left = b;
        root.right = c;
        Node d = new Node(6);
        Node e = new Node(2);
        b.left = d;
        b.right = e;
        Node f = new Node(0);
        Node g = new Node(8);
        c.left = f;
        c.right = g;
        Node h = new Node(7);
        Node i = new Node(4);
        e.left = h;
        e.right = i;
        Node result = lowestCommonAncestor(root, b, c);
        System.out.println(result.val);
    }
}
