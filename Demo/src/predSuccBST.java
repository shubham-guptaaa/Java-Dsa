// Input: 50 30 70 20 40 60 80
// Output: 20 30 40 50 60 70 80
import java.util.*;
public class predSuccBST {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static Node pred(Node root, Node target){
        Node predecessor = null;
        while (root != null) {
            if (target.val <= root.val) {
                root = root.left;
            } else {
                predecessor = root;
                root = root.right;
            }
        }
        return predecessor;
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
        }
    public static void main(String[] args) {
        // Input: 50 30 70 20 40 60 80
        // Output: 20 30 40 50 60 70 80
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();
        Node root = null;
        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            root = insert(root, val);
        }
        System.out.println("Inorder traversal of the BST:");
        inorder(root);
        System.out.println();
        System.out.println("Enter the target node value:");
        int targetVal = scanner.nextInt();
        Node target = new Node(targetVal);
        Node predecessor = pred(root, target);
        if (predecessor == null) {
            System.out.println("Predecessor not found");
        } else {
            System.out.println("Predecessor: " + predecessor.val);
        }
        scanner.close();
        }
    }
