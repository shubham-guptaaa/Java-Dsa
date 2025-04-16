import java.util.*;
class longestCommonSubsequence{
    // private static int helper(String str1, String str2, int idx1, int idx2, int[][] dp){
    //     if(idx1<0 || idx2<0) return 0;
    //     if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
    //     if(str1.charAt(idx1)==str2.charAt(idx2)){
    //         return dp[idx1][idx2] = 1 + helper(str1, str2, idx1-1, idx2-1, dp);
    //     }
    //     return dp[idx1][idx2] = 0 + Math.max(helper(str1, str2, idx1-1, idx2, dp), helper(str1, str2, idx1, idx2-1, dp));
    // }
    public static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];
        // for(int i = 0; i<n; i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // return helper(str1, str2, n-1, m-1, dp);
        for(int i = 0; i<=n; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j<=m; j++){
            dp[0][j] = 0;
        }
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1 and string 2");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(lcs(str1, str2));
        sc.close();
    }
}