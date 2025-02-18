import java.util.*;
public class postorder1stack {
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
    private static List<Integer> helper(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if(root==null){
            return ans;
        }
        st.push(root);
        while (!st.isEmpty()) {
            Node curr = st.pop();
            ans.add(curr.val);
            if(curr.left!=null){
                st.push(curr.left);
            }
            if(curr.right!=null){
                st.push(curr.right);
            }
        }
        Collections.reverse(ans);
        return ans;

    }
    public static void main(String[] args) {
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
        List<Integer> ans = helper(root);
        System.out.println(ans);
    }
}
