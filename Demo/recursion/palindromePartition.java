import java.util.ArrayList;
import java.util.List;

public class palindromePartition {
    private static boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    private static void helper(String s, int idx, List<List<String>> ans, List<String> ds){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i<s.length(); ++i){
            if(isPalindrome(s,idx,i)){
            ds.add(s.substring(idx,i+1));
            helper(s,i+1, ans, ds);
            ds.remove(ds.size()-1); //backtracking
        }
        }

    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        helper(s, 0, ans, ds);
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(partition("aabb"));
    }
}
