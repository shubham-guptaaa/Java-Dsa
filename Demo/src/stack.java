import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // push
        System.out.println("PUSH");
        System.out.println(st.push(34));
        System.out.println(st.push(3));
        System.out.println(st.push(4));
        System.out.println(st.push(304));
        System.out.println(st.push(32));
        //pop
        System.out.println("POP");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
    
}
