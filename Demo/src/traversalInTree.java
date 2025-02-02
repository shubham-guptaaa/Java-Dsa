public class traversalInTree {
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
    public static void preOrder(Node root){
        // root , left, right
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        // left , right , root
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void inOrder(Node root){
        // left , root, right
        if(root ==  null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void nthLevel(Node root, int n){
        if(root==null) return;
        if(n==1) System.out.print(root.val+" ");
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static int height(Node root){
        if(root==null || root.left == null && root.right==null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));

    }
    public static void levelOrderTraversal(Node root, int n){
        if(root==null) return;
        if(n==1) System.out.print(root.val+" ");
        levelOrderTraversal(root.left, n-1);
        levelOrderTraversal(root.right, n-1);
    }

    public static void main(String[] args){
        Node root = new Node(2);
        Node b = new Node(4);
        Node c = new Node(10);
        root.left = b;
        root.right = c;
        Node d = new Node(6);
        Node e = new Node(5);
        b.left = d;
        b.right = e;
        Node f = new Node(8);
        Node g = new Node(11);
        c.left = f;
        c.right = g;
        System.out.println("PreOrder Traversal: -");
        preOrder(root);
        System.out.println();
        System.out.println("PostOrder Traversal: -");
        postOrder(root);
        System.out.println();
        System.out.println("Inorder Traversal: -");
        inOrder(root);
        System.out.println();
        System.out.println("Nth level order Traversal: -");
        nthLevel(root, 3);
        System.out.println();
        System.out.println("Level Order Traversal: -");
        int h = height(root)+1;
        for(int i = 0; i<=h; i++){
            levelOrderTraversal(root, i);
        }

    }
}
