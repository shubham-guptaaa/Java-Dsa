import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class delete0Child {
    public static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node constructTree(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < arr.length) {
            Node current = queue.poll();

            if (i < arr.length && arr[i] != 0) { // Ignore 0 (assuming 0 means null)
                current.left = new Node(arr[i]);
                queue.add(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != 0) {
                current.right = new Node(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.val + " ");  // Print node value

            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
        System.out.println(); // New line after traversal
    }

    public static void delete(Node root, int val) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node target = null, temp = null, parent = null;

        // Level-order traversal to find target node & last node
        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.val == val) {
                target = temp; // Found node to delete
            }

            // Keep track of the deepest rightmost node
            if (temp.left != null) {
                parent = temp;
                queue.add(temp.left);
            }
            if (temp.right != null) {
                parent = temp;
                queue.add(temp.right);
            }
        }

        if (target != null) {
            target.val = temp.val; // Replace target with deepest node's value

            // Remove the deepest rightmost node
            if (parent != null) {
                if (parent.right == temp) {
                    parent.right = null;
                } else {
                    parent.left = null;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {50, 20, 60, 17, 34, 55, 89, 10, 0, 28, 40, 0, 0, 10, 0, 0, 14};

        Node root = constructTree(arr);
        System.out.println("Level Order Traversal (Before Deletion):");
        levelOrder(root);

        delete(root, 28);

        System.out.println("Level Order Traversal (After Deletion):");
        levelOrder(root);
    }
}
