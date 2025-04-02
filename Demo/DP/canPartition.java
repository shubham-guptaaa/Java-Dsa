import java.util.*;

public class canPartition {
    private static int sum(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        for(int i  =0; i<n; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    public static boolean can(int[] nums) {
        int n = nums.length;
        int totalSum = sum(nums);
        if(totalSum%2!=0) return false;
        int target = totalSum/2;
        boolean[][] dp = new boolean[n+1][target+1];
        for(int i =0; i<n; i++){
            dp[i][0] = true;
        }
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=target; j++){
                if(j>=nums[i-1]){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element:-");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element:-");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(can(nums));
        sc.close();
    }
}
