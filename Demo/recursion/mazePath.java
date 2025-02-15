import java.util.ArrayList;
import java.util.List;

public class mazePath {
    public static void main(String[] args) {
        path("", 3, 3);
        System.out.println();
        List<String> ans = returnPath("", 3, 3);
        System.out.println(ans);
        System.out.println();
        System.out.println(returnAllPosiblePath("", 3, 3));
    }
    public static void path(String p, int r, int c){
        if(r==1&&c==1){
            System.out.print(p+" ");
            return;
        }
        if(r>1){
            path(p+"D", r-1, c);

        }
        if(c>1){
            path(p+'R', r, c-1);
        }
    }
    public static List<String> returnPath(String s, int r, int c){
        if(r==1&&c==1){
            List<String> ans = new ArrayList<>();
            ans.add(s);
            return ans;
        }
        List<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(returnPath(s+"D", r-1, c));
        }
        if(c>1){
            ans.addAll(returnPath(s+"R", r, c-1));
        }
        return ans;
    }
    public static List<String> returnAllPosiblePath(String s, int r, int c){
        if(r==1&&c==1){
            List<String> ans = new ArrayList<>();
            ans.add(s);
            return ans;
        }
        List<String> ans = new ArrayList<>();
        if(r>1){
            ans.addAll(returnAllPosiblePath(s+"D", r-1, c));
            
        }
        if(c>1){
            ans.addAll(returnAllPosiblePath(s+"R", r, c-1));
            
        }
        if(r>1&&c>1){
            ans.addAll(returnAllPosiblePath(s+"d", r-1, c-1));
        }
        return ans;

    }
}
