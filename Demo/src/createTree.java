import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class createTree {
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
    public static void buildTree(Node root0, ArrayList<Integer> v ){

        // Code here
        Queue<Node> q = new LinkedList<>();
        if(v==null || v.isEmpty()){
            return;
        }
        root0.val = v.get(0);
        q.add(root0);
        int i = 1;
        while(i<v.size() && !q.isEmpty()){
            Node curr = q.poll();
            if(i<v.size()){
                curr.left = new Node(v.get(i));
                q.add(curr.left);
                i++;
            }
            if(i<v.size()){
                curr.right = new Node(v.get(i));
                q.add(curr.right);
                i++;
            }
        }
    }

    public static void printTree(Node root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        // Input: 
        // nodes = [1 2 3 4 5 6 7]
        // Output: 
        //           1
        //         /   \
        //         2    3
        //        /  \  /  \
        //        4  5 6   7
        // Explanation: 
        // The 7 node binary tree is represented above.
        ArrayList<Integer> v = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Node root = new Node(0);
        buildTree(root, v);
        printTree(root); // Add this line to print the tree
    }
}
