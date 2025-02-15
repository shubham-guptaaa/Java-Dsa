import java.util.*;
public class mazeWithRestriction {
    public static void main(String[] args) {
        boolean[][] board = {{true,true,true},{true,false,true},{true,true,true}};
        System.out.println(printPath("", board, 0, 0));
    }
    public static List<String> printPath(String p, boolean[][] board, int r, int c){
        if(r==board.length-1 && c==board[0].length-1){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        if(board[r][c]==false){
            List<String> ans = new ArrayList<>();
            return ans;
        }
        List<String> ans = new ArrayList<>();
        if(r<board.length-1){
            ans.addAll(printPath(p+"D", board, r+1, c));
        }
        if(c<board[0].length-1){

            ans.addAll(printPath(p+"R", board, r, c+1));
        }
        return ans;
    }
}
