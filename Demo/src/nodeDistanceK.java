public class nodeDistanceK {
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
    public static void printNodeSubtree(Node root, int k){
        if(root==null || k<0){
            return;
        }
        if(k==0){
            System.out.print(root.val+" ");
        }
        printNodeSubtree(root.left, k-1);
        printNodeSubtree(root.right, k-1);
    }
    public static int printNodeToAncestors(Node root, Node target, int k){
        if(root==null) return -1;
        if(root==target){
            printNodeSubtree(root, k);
            return 0;
        }
        int dleft = printNodeToAncestors(root.left, target, k);
        if(dleft!=-1){
            if(dleft+1==k){
                System.out.print(root.val+" ");
            }
            else{
                printNodeSubtree(root.right, k-dleft-2);
            }
            return dleft+1;
        }

        int dright = printNodeToAncestors(root.right, target, k);
        if(dright!=-1){
            if(dright+1==k){
                System.out.print(root.val+" ");
            }
            else{
                printNodeSubtree(root.left, k-dright-2);
            }
            return dright+1;
        }
        return -1;
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
        System.out.println(printNodeToAncestors(root, a, 3));
    }
}
