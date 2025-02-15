import java.util.ArrayList;
import java.util.List;

public class mazeAllPath {
    public static void main(String[] args) {
        boolean[][] board = {{true,true,true},{true,true,true},{true,true,true}};
        System.out.println(printAllPath("", board, 0, 0)); 
    }
    public static List<String> printAllPath(String p, boolean[][] board, int r, int c){
        if(r==board.length-1 && c==board[0].length-1){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        if(board[r][c]==false){
            List<String> ans = new ArrayList<>();
            return ans;
        }
        //mark as visited
        board[r][c] = false;
        List<String> ans = new ArrayList<>();
        if(r<board.length-1){
            ans.addAll(printAllPath(p+"D", board, r+1, c));
        }
        if(c<board[0].length-1){

            ans.addAll(printAllPath(p+"R", board, r, c+1));
        }
        if(r>0){
            ans.addAll(printAllPath(p+"U", board, r-1, c));
        }
        if(c>0){
            ans.addAll(printAllPath(p+"L", board, r, c-1));
        }
        //backtracking
        board[r][c] = true;
        return ans;
    }
    
}
