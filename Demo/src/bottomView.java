import java.util.*;

public class bottomView {
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
    public static class Pair{
        int hd;
        Node root;
        Pair(int hd, Node root){
            this.hd = hd;
            this.root = root;
        }
    }
    public static ArrayList <Integer> View(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,Integer> mpp = new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            mpp.put(curr.hd, curr.root.val);
            if(curr.root.left!=null){
                q.add(new Pair(curr.hd-1, curr.root.left));
            }
            if(curr.root.right!=null){
                q.add(new Pair(curr.hd+1, curr.root.right));
            }
        }
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;

    }
    public static void main(String[] args) {
        Node root = new Node(20);
        Node b = new Node(8);
        Node c = new Node(22);
        root.left = b;
        root.right = c;
        Node d = new Node(5);
        Node e = new Node(3);
        b.left = d;
        b.right = e;
        Node f = new Node(4);
        Node g = new Node(25);
        c.left = f;
        c.right = g;
        Node h = new Node(10);
        e.left = h;
        Node i = new Node(14);
        f.right = i;
        System.out.println(View(root));
    }
}
