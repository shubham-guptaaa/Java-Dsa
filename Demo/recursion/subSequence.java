import java.util.*;
public class subSequence {
    static ArrayList<String> printALlSubSequence(String str){
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if(str.length()==0){
            ans.add("");
            return ans;
        }
        char ch = str.charAt(0);
        //recursive call
        ArrayList <String> smallAns = printALlSubSequence(str.substring(1)); // ["bc", "b". "c", ""];
        //self work
        for(String s: smallAns){
            ans.add(s);
            ans.add(ch+s);
        }
        return ans;



    }
    public static void main(String[] args) {
        ArrayList<String> result = printALlSubSequence("abc");
        for(String s: result){
            System.out.print(s+" ");
        }
    }
}
