public class palindromList {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class palindromLinkedList {
        Node head;

        public static Node reverse(Node head){
            Node curr = head;
            Node prev = null;
            Node Next = null;
            while(curr != null) {
                Next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = Next;
            }
            return prev;
        }

        public boolean isPalindrom(Node head) {
            if(head == null || head.next == null) {
                return true;
            }

            Node slow = head;
            Node fast = head;

            // Find the middle of the list
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Reverse the second half of the list
            Node temp = reverse(slow);

            // Compare the first half and reversed second half
            Node p1 = head;
            Node p2 = temp;
            while(p2 != null) {
                if(p1.val != p2.val) {
                    return false;
                }
                p1 = p1.next;
                p2 = p2.next;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        palindromLinkedList ll = new palindromLinkedList();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(8);
        Node d = new Node(7);
        Node e = new Node(2);
        Node f = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        boolean check = ll.isPalindrom(a);
        System.out.println(check);  // Output should be 'true' for a palindrome list
    }
}
