import java.util.*;
public class removeStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in stack");
        int n = sc.nextInt();
        System.out.println("Enter element");
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        // int idx = 2;
        Stack<Integer> rt = new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
        System.out.println(rt);
        while(rt.size()>0) {
            st.push(rt.pop());
        }
        System.out.println(st);
        sc.close();
    }
}
