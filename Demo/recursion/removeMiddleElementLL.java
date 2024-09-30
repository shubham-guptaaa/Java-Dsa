class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removeMiddleElementLL {
    Node head = null;

    removeMiddleElementLL() {
        head = null;
    }

    public Node remove(Node head) {
        Node slow = head;
        Node fast = head;
        // Node prev = null;
        if (head.next == null) {
            return null;
        }
        while (fast.next.next != null && fast.next.next.next != null) {
            // prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

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
    public  void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removeMiddleElementLL rem = new removeMiddleElementLL();
        rem.addNodeAtLast(2);
        rem.addNodeAtLast(5);
        rem.addNodeAtLast(9);
        rem.addNodeAtLast(1);
        rem.addNodeAtLast(56);
        System.out.println("List Before delete");
        rem.printList(rem.head);

        Node removeMiddle = rem.remove(rem.head);
        if (removeMiddle != null) {
            System.out.println("The new updated list is:");
            rem.printList(removeMiddle);

        } else {
            System.out.println("List is empty");
        }
    }

}
