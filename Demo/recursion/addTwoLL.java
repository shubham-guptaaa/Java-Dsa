import java.util.*;
public class addTwoLL {
    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = add(l1, l2);
        System.out.println("Result");
        printList(result);
        
    }
    
    class Node{
        int val;
        Node next;
        
        
        Node(int val){
            this.val = val; 
        }
        Node(int val, Node next) { 
            this.val = val; 
            this.next = next; 
        }
    }
    static Node add(Node l1, Node l2){
        Node dummyNode = new Node(0);
        Node temp = dummyNode;
        int carry = 0;

        while(l1!=null || l2!=null){
            int fVal = (l1!=null) ? l1.val: 0;
            int sVal = (l2!=null) ? l2.val: 0;

            int sum = fVal + sVal + carry;
            carry = sum/10;
            int currDigit = sum%10;
            temp.next = new Node(currDigit);

            temp = temp.next;

            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
            if(carry>0){
                temp.next = new Node(carry);
            }


        }
        return dummyNode.next;


    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
    
}
