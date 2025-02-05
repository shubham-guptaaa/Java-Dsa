import java.util.ArrayList;
import java.util.List;
public class binaryTreePath {
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
    public static void helper(Node root, List<String> ans, String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s = s + root.val;
            ans.add(s);
            return;
        }
        helper(root.left, ans, s+root.val+"->");
        helper(root.right, ans, s+root.val+"->");
    }
    public List<String> binaryTreePaths(Node root){
        List<String> str = new ArrayList<>();
        helper(root, str, "");
        return str;
    } 
    public static void main(String[] args) {
       Node root = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       root.left = b;
       root.right = c;
       Node d = new Node(5);
       b.right = d;
    binaryTreePath tree = new binaryTreePath();
    List<String> paths = tree.binaryTreePaths(root);
    System.out.println(paths);
        
    }
    
}
