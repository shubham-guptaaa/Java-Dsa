import java.util.Stack;

public class linkedListImplementaionStack {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LLStack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayRecu(Node h) {
            if (h == null)
                return;
            displayRecu(h.next);
            System.out.print(h.data + " ");
        }

        void display() {
            displayRecu(head);
            System.out.println();
        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() { // getter
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }
        // boolean isFull(){
        // if(size)
        // }

    }

    public static void main(String[] args) {
        // Stack st = new Stack();
        LLStack st = new LLStack();
        st.push(4);
        st.display(); // 4
        st.push(5);
        st.display(); // 4 5
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size()); // 3
        st.pop();
        st.display(); // 4 5
        System.out.println(st.size());
        st.push(7);
        st.push(0);
        st.display();

    }
}
