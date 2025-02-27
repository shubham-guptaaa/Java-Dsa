public class searchBST {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static Node search(Node root, int target){
        if(root==null) return null;
        if(root.val==target) return root;
        if(root.val>target) return search(root.left, target);
        if(root.val<target) return search(root.right, target);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        Node b = new Node(20);
        Node c = new Node(60);
        root.left = b;
        root.right = c;
        Node d = new Node(17);
        Node e = new Node(34);
        b.left = d;
        b.right = e;
        Node f = new Node(55);
        Node g = new Node(89);
        c.left = f;
        c.right = g;
        Node result = search(root, 60);
       System.out.println(result.val);
    }
}