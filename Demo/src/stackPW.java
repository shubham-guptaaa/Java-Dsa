import java.util.*;

public class stackPW {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        System.out.println("size is : " + st.size());
        System.out.println(st);
        st.push(1);
        System.out.println("size is : " + st.size());
        System.out.println(st);
        st.push(3);
        System.out.println("size is : " + st.size());
        System.out.println(st);
        st.push(4);
        System.out.println("size is : " + st.size());
        System.out.println(st);
        st.push(6);
        System.out.println("size is : " + st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is : " + st.size());
        // Getting the first element of statck
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
    }
    
}
