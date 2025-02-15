import java.util.ArrayList;
import java.util.List;

public class generateAllValidParenthesis {
    public static void generate(List<String> ans, String p, int open, int close, int n){
        if(p.length()==2*n){
            ans.add(p);
            return;
        }
        if(open<n){
            generate(ans, p+"(", open+1, close, n);
        }
        if(close<open){
            generate(ans, p+")", open, close+1, n);

        }

    }
    public static List<String> generateParenthesis(int n){
        List<String> ans = new ArrayList<>();
        generate(ans, "", 0, 0, 3);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    
}
