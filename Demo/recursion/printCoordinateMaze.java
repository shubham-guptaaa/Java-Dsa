import java.util.ArrayList;
import java.util.List;

public class printCoordinateMaze {
    public static void main(String[] args) {
        boolean[][] board = {{true,true,true},{true,true,true},{true,true,true}};
        // System.out.println(printAllPath("", board, 0, 0)); 
        int[][] path = new int [board.length][board[0].length];
        System.out.println(printAllCoordinatesPath("", board, 0, 0, path, 1));
        
    }
    public static List<String> printAllCoordinatesPath(String p, boolean[][] board, int r, int c, int[][] path, int steps){
        if(r==board.length-1 && c==board[0].length-1){
            path[r][c] = steps;
            for(int[] arr : path){
                System.out.println(arr.toString());
            }
            System.out.println();
            List<String> ans = new ArrayList<>();
            return ans;

        }
        if(board[r][c]==false){
            List<String> ans = new ArrayList<>();
            return ans;
        }
        //mark as visited
        board[r][c] = false;
        path[r][c] = steps;
        List<String> ans = new ArrayList<>();
        if(r<board.length-1){
            ans.addAll(printAllCoordinatesPath(p+"D", board, r+1, c, path, steps+1));
        }
        if(c<board[0].length-1){

            ans.addAll(printAllCoordinatesPath(p+"R", board, r, c+1, path, steps+1));
        }
        if(r>0){
            ans.addAll(printAllCoordinatesPath(p+"U", board, r-1, c, path, steps+1));
        }
        if(c>0){
            ans.addAll(printAllCoordinatesPath(p+"L", board, r, c-1, path, steps+1));
        }
        //backtracking
        board[r][c] = true;
        path[r][c] = 0;
        return ans;
    }
}
