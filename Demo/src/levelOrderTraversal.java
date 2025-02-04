import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

// import javax.swing.tree.TreeNode; // Remove this import as it is not needed

public class levelOrderTraversal {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void bfs(Node root) {  //Iterative
        Queue<Node> q = new LinkedList<>();
        if (root != null)
            q.add(root);
        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
       Queue<Node> q = new LinkedList<>();
       List<List<Integer>> parentT = new ArrayList<>();
       if(root==null) return parentT;
       q.add(root);
       while(!q.isEmpty()){
        int n = q.size();
        List<Integer> childT = new ArrayList<>();
        for(int i = 0; i<n; i++){
        Node temp = q.poll();
        childT.add(temp.val);
        if(temp.left!=null){
            q.add(temp.left);
        }
        if(temp.right!=null){
            q.add(temp.right);
        }
       }
        parentT.add(childT);
       }return parentT;
    }
    

    public static void main(String[] args) {
        Node root = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        root.left = b;
        root.right = c;
        Node d = new Node(4);
        Node e = new Node(5);
        b.left = d;
        b.right = e;
        Node f = new Node(6);
        Node g = new Node(7);
        c.left = f;
        c.right = g;
        bfs(root);
        System.out.println();
        List<List<Integer>> result = new levelOrderTraversal().levelOrder(root);
        for (List<Integer> level : result) {
            for (int val : level) {
                System.out.print(val + " ");
            }
        }
        System.out.println();
    }
}
