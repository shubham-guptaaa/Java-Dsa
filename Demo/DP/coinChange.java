import java.util.*;
public class coinChange {
    public static int helper(int[] arr, int amt, int dp[]){
        if(amt==0) return 0;
        if(amt<0) return Integer.MAX_VALUE;
        if(dp[amt]!=Integer.MAX_VALUE) return dp[amt];
        int min = Integer.MAX_VALUE;
        for(int i =0; i<arr.length; i++){
            int pick = helper(arr, amt-arr[i], dp);
            if(pick!=Integer.MAX_VALUE){
                min = Math.min(min, pick+1);
            }
        }
        return dp[amt] = min;
    }
    public static int CoinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        return helper(coins, amount, dp);
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amt = 11;
        System.out.println(CoinChange(coins, amt));
    }
}
