public class binaryTreeImplementation {
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
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" -> ");
        if(root.left!=null)
        System.out.print(root.left.val+" , ");
        else
        System.out.print("null"+" ");
        if(root.right!=null)
        System.out.print(root.right.val);
        else
        System.out.print("null"+" ");
        System.out.println();
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        // root.val = 10;
        Node b = new Node(2);
        Node c = new Node(3);
        root.left = b;
        root.right = c;
        Node d = new Node(4);
        b.left = d;
        Node e = new Node(5);
        b.right = e;
        Node f = new Node(6);
        c.left = f;
        Node g = new Node(7);
        c.right = g;
        display(root);


    }
    
}
