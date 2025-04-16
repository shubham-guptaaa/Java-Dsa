public class TargetSum {
    private static int helper(int[] arr, int target, int idx){
        if(target==0) return 1;
        if(idx<0) return 0;
        int include = helper(arr, target-arr[idx], idx-1);
        int exclude = helper(arr, target, idx-1);
        return include + exclude;
    }
    public static int countPartition(int[] arr, int d){
        int n = arr.length;
        int totSum = 0;
        for(int i : arr){
            totSum += i;
        }
        if(totSum-d<0 || (totSum-d)%2 != 0) return 0;
        return helper(arr, (totSum-d)/2, n-1);


    }
    public static int targetSum(int[] arr, int target){
        return countPartition(arr, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int target = 3;
        System.out.println(targetSum(arr, target));
    }
}
