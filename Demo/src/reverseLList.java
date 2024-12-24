// public class reverseLList {
//     public static class Node {
//         int val;
//         Node next;

//         Node(int val) {
//             this.val = val;
//         }
//     }

//     public static class LLimplementation {
//         Node head;

//         Node reverseLL(Node head) {
//             Node prev = null;
//             Node Next = null;
//             Node curr = head;
//             while (curr != null) {
//                 Next = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = Next;
//             }
//             return prev;
//         }
//     }

//     public static void display(Node head) {
//         if (head == null)
//             return;
//         System.out.print(head.val + " " + "->" + " ");
//         display(head.next);
//     }

//     public static void main(String[] args) {
//         LLimplementation ll = new LLimplementation();

//         Node a = new Node(1);
//         Node b = new Node(2);
//         Node c = new Node(3);
//         Node d = new Node(4);
//         Node e = new Node(35);
//         Node f = new Node(8);
//         Node g = new Node(9);

//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         e.next = f;
//         f.next = g;
//         g.next = null;

//         System.out.println("Original List:");
//         display(a);
//         Node reverseHead = ll.reverseLL(a);
//         System.out.println("\nReversed List:");
//         display(reverseHead);
//     }

// }
import java.util.Scanner;

public class reverseLList {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LLimplementation {
        Node head;

        Node reverseLL(Node head) {
            Node prev = null;
            Node next = null;
            Node curr = head;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
    }

    public static void display(Node head) {
        if (head == null)
            return;
        System.out.print(head.val + " -> ");
        display(head.next);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLimplementation ll = new LLimplementation();

        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The list is empty.");
            return;
        }

        // Taking input for the linked list
        System.out.println("Enter the values for the nodes:");
        Node head = null;
        Node current = null;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode; // Set the first node as the head
            } else {
                current.next = newNode; // Link the new node to the list
            }
            current = newNode; // Move the pointer to the new node
        }

        // Display the original list
        System.out.println("Original List:");
        display(head);

        // Reverse the list
        Node reverseHead = ll.reverseLL(head);

        // Display the reversed list
        System.out.println("\nReversed List:");
        display(reverseHead);

        sc.close();
    }
}
