import java.util.*;
public class displayStack {
    public static void displayStRec(Stack<Integer> s){
        if(s.size()==0){
            return;
        }
        int top = s.pop();
        System.out.print(top+" ");
        displayStRec(s);
        s.push(top);
        }
        public static void displayStackRec(Stack<Integer> s){
            if(s.size()==0){
                return;
            }
            int top = s.pop();
            displayStRec(s);
            System.out.print(top+" ");
            s.push(top);
            }
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
        Stack<Integer> rt = new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
        }
        while (rt.size()>0) {
            int x = rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();

        // Other method
        System.out.println("This method is done by using Array");
        int m = st.size();
        int[] arr = new int[m];
        for(int i= n-1; i>=0; i--){
            arr[i] = st.pop();
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
        System.out.println();
        // display recursive
        System.out.println("Display reverse of stack Using recusrion");
        // displayStRec(st);
        System.out.println();
        System.out.println("Display stack using recursion");
        displayStackRec(st);
    }
    
}
