import java.util.*;

public class removeBracket {
    public static String makeValidBracket(String str){
        int n = str.length();
        Stack<Integer> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);
                if(ch == '('){
                    st.push(ch);
                    result.append(ch);
                }
                else if(ch == ')'){
                    if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                    result.append(ch);
                    

                }
            }
            
        }
        while(!st.isEmpty()){
            st.pop();
        }
        return result.toString();
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bracket to make a valid bracket");
        String str = sc.nextLine();
        System.out.println(makeValidBracket(str));
        sc.close();


    }
    
}
