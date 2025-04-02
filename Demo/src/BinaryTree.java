import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
    public Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;

    }
}


class BinaryTree {
    Node root;

    // Inorder Traversal (Left -> Root -> Right)
    void inorderTraversal(Node node) {
        if (node == null)
            return;
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    // Build tree level-wise from user input
    Node buildTree(Scanner sc) {
        System.out.print("Enter root node value: ");
        int rootValue = sc.nextInt();
        Node root = new Node(rootValue);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.print("Enter left child of " + current.data + " (or -1 for no child): ");
            int leftValue = sc.nextInt();
            if (leftValue != -1) {
                current.left = new Node(leftValue);
                queue.add(current.left);
            }

            System.out.print("Enter right child of " + current.data + " (or -1 for no child): ");
            int rightValue = sc.nextInt();
            if (rightValue != -1) {
                current.right = new Node(rightValue);
                queue.add(current.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        
        tree.root = tree.buildTree(sc);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);
        
        sc.close();
    }
}
