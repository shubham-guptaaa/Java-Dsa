class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LL {
    Node head;
    
    public LL() {
        head = null;
    }
    
    // Method to find the middle element of the Linked List
    public Node middleElementLL(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;  // Move fast two steps
        }
        return slow;  // 'slow' will point to the middle node
    }

    // Method to add a node at the end of the Linked List
    public void addNodeAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        // Adding some nodes
        list.addNodeAtLast(1);
        list.addNodeAtLast(2);
        list.addNodeAtLast(3);
        list.addNodeAtLast(4);
        list.addNodeAtLast(5);

        // Finding the middle element
        Node middle = list.middleElementLL(list.head);
        if (middle != null) {
            System.out.println("Middle Element: " + middle.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
