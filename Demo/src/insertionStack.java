import java.util.*;

public class insertionStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in stack you have to enter");
        int n = sc.nextInt();
        System.out.println("Enter the element: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        int idx = 2;
        int x = 7;
        System.out.println("Insertion of element: ");
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while (temp.size()>0) {
            st.push(temp.pop());
        }
        System.out.println(st);
        sc.close();
    }

}
