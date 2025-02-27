public class insertBST {
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
    public static Node insert(Node root, int val){
        Node temp = new Node(val);
        if(root==null){
            root=temp;
            return root;
        }
        if(root.val>val){
            if(root.left==null){
                root.left = temp;
            }
            else{
                insert(root.left, val);
            }
        }
        else{
            if(root.right==null){
                root.right = temp;

            }
            else{
                insert(root.right, val);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        
    }
}
