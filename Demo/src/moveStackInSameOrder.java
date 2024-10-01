import java.util.Scanner;
import java.util.Stack;
public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();        
    System.out.println("Enter the number of element in stack you have to enter");
    int n = sc.nextInt();
    System.out.println("Enter the element: ");
    for(int i = 0; i<n; i++){
        int x = sc.nextInt();
        st.push(x);
    }
    System.out.println(st);
    Stack<Integer> rev =new Stack<>();
    System.out.println("Reverse of Stack");
        while (st.size()>0) {
            int m = st.peek(); //get the first element of stack
            rev.push(m); //push the element into other stack;
            st.pop(); //then pop the element of stack
        }
        System.out.println(rev);
    Stack<Integer> copy = new Stack<>();
    System.out.println("Copy of the first stack");  
    while(rev.size()>0){
        copy.push(rev.pop());
    }
    System.out.println(copy);
    sc.close();
    }
    
}
