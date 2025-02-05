class sameTree{
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
    public static boolean isSameTree(Node p, Node q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;

        if(p.val!=q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        root1.left = b;
        root1.right = c;
        Node root2 = new Node(1);
        Node d = new Node(2);
        Node e = new Node(3);
        root2.left = d;
        root2.right = e;
        System.out.println(isSameTree(root1, root2));
    }
}