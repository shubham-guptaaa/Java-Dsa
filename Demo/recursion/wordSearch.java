public class wordSearch {
    public static boolean check(char[][] board, String word, int r, int c){
        if (word.length() == 0) return true;
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(0)) return false;
        char temp = board[r][c];
        board[r][c] = '*'; // mark as visited
        String nextWord = word.substring(1);
        boolean found = check(board, nextWord, r + 1, c) ||
                        check(board, nextWord, r - 1, c) ||
                        check(board, nextWord, r, c + 1) ||
                        check(board, nextWord, r, c - 1);
        board[r][c] = temp; // unmark
        return found;
    }

    public static boolean exist(char[][] board, String word){
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (check(board, word, r, c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
        // Output: true
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String str = "SEE";
        System.out.println(exist(board, str)); // Output: true
    }
}
