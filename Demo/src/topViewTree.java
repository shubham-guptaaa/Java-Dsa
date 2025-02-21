import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class topViewTree{
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
    public static class Pair{
        int hd;
        Node root;
        Pair(int hd){
            this.hd = hd;
        }
        Pair(int hd, Node root){
            this.hd = hd;
            this.root = root;
        }
    }
    private  static ArrayList<Integer> topView(Node root){
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> mpp = new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(!mpp.containsKey(curr.hd)){
                mpp.put(curr.hd, curr.root.val);
            }
            if(curr.root.left!=null){
                q.add(new Pair(curr.hd-1, curr.root.left));
            }
            if(curr.root.right!=null){
                q.add(new Pair(curr.hd+1, curr.root.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(6);
        Node b = new Node(2);
        Node c = new Node(1);
        root.left = b;
        root.right = c;
        // Node d = new Node(4);
        Node e = new Node(5);
        // b.left = d;
        b.right = e;
        // Node f = new Node(6);
        Node g = new Node(5);
        // c.left = f;
        c.right = g;
        Node h = new Node(4);
        e.right = h;
        System.out.println(topView(root));
    }
}