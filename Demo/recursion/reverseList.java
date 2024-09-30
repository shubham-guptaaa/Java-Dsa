public class reverseList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        if(head == null) return;
        System.out.print(head.data+" " +"->"+" ");
        display(head.next);
    }
    public static void revdisplay(Node head){
        if(head == null) return;
        revdisplay(head.next);
        System.out.print(head.data+" " +"->"+" ");
    }
    public static Node reverse(Node head){
        if(head.next == null){
            return head;
        }
            Node node  = reverse(head.next);
            
            head.next.next = head; //Interchanging Node connection (Work)
            head.next = null;
            return node;
        
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(35);
        Node f = new Node(8);
        Node g = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        display(a);
        System.out.println();
        System.out.println("reverse linked list");
        // revdisplay(a);
        Node rev = reverse(a);
        System.out.println();
        display(rev);
    }
    
}
