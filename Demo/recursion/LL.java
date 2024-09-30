class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LL{
    Node head;
    public LL(){
        head = null;
    }
}
public Node middleElementLL(Node head){
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next;
    }
    return slow;


}
public static void main(String[] args) {
    LL list = new LL();
    
}
