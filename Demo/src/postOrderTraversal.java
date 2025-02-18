import java.util.*;
class postOrderTraversal{
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
    public static List<Integer> postorder(Node root){
        // 2 stack method
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        st1.push(root);
        while(!st1.isEmpty()){
            Node temp = st1.pop();
            st2.push(temp);
            if(temp.left!=null){
                st1.push(temp.left);
            }
            if(temp.right!=null){
                st1.push(temp.right);
            }
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().val);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for the nodes in level order (use -1 for null nodes):");
        int[] values = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (values.length == 0 || values[0] == -1) {
            System.out.println("The tree is empty.");
            return;
        }
        Node root = new Node(values[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            Node current = queue.poll();
            if (values[i] != -1) {
            current.left = new Node(values[i]);
            queue.add(current.left);
            }
            i++;
            if (i < values.length && values[i] != -1) {
            current.right = new Node(values[i]);
            queue.add(current.right);
            }
            i++;
        }
        List<Integer> ans = postorder(root);
        System.out.println(ans);
        scanner.close();
    }
}
