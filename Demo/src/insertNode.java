import java.util.Scanner;

class insertNode {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head = null;
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = new Node(x);
        if(head==null) head=temp;
        else {
            Node newNode = head;
        while(newNode.next!=null){
            newNode = newNode.next;
        }
        newNode.next = temp;
    }
        return head;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        insertNode obj = new insertNode();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of node");
        int n = sc.nextInt();
        System.out.println("Enter the value of nodes");
        for(int i = 0; i<n; i++){
            int value = sc.nextInt();
            obj.head = obj.insertAtEnd(obj.head, value);
        }
        System.out.println("The linked list is");
        insertNode.printList(obj.head);
        sc.close();
    }
}