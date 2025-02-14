import java.util.ArrayList;
import java.util.*;

public class letterCombination {
    public static List<String> helper(String up, String p, String[] map){
        if(up.isEmpty()){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int digit = up.charAt(0)-'2';
        String letter = map[digit];
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i<letter.length(); i++){
            char ch = letter.charAt(i);
            ans.addAll(helper(up.substring(1), p+ch, map));
            
        }
        return ans;
    }
    public static List<String> letterCombinations(String up){
        String map[] = {
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        if(up.isEmpty()){
            return new ArrayList<>();
        }
        List<String> result = helper(up, "", map);
        return result;
    }
    public static void main(String[] args) {
        List<String> result = letterCombinations("23");
        System.out.println(result);
    }
}
