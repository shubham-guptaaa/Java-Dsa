import java.util.ArrayDeque;
import java.util.Queue;

public class countNode {
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
    public static int count(Node root){
        //  Method 1

        if(root==null) return 0;
        return 1+count(root.left)+count(root.right);

    }
    public static int countN(Node root){
        if(root==null) return 0;
        int count = 0;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            count++;
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(5);
        Node b = new Node(2);
        root.left = a;
        root.right = b;
        Node c = new Node(3);
        Node d =new Node(4);
        b.left = c;
        b.right = d;
        int ans = count(root);
        System.out.println(ans);
        System.out.println(countN(root));
    }
}
