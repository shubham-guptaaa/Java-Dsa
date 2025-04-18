import java.util.Arrays;
public class numDistinct {
    private static int helper(String s, String t, int i, int j, int[][] dp){
        if(j<0) return 1;
        if(i<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j] = helper(s, t, i-1, j-1, dp)+helper(s, t, i-1, j, dp);
        }
        else{
            return dp[i][j] = helper(s, t, i-1, j, dp);
        }
    }
    public static int Distinct(String s, String t){
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 0;i<n; i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(s, t, n-1, m-1, dp);
    }
    public static void main(String[] args) {
        String s = "babgbag";
        String t = "bag";
        System.out.println(Distinct(s, t));
    }
    
}
