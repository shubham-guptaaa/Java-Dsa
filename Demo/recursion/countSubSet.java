public class countSubSet {
    private static int helper(int[] arr, int idx, int target){
        if (idx == arr.length) {
            return target == 0 ? 1 : 0;
        }
        int left = helper(arr, idx+1, target-arr[idx]);
        int right = helper(arr, idx+1, target);
        return left+right;
        
    }
    public static int perfectSum(int[] nums, int target) {
        // code here
        return helper(nums, 0, target);
    }
    public static void main(String[] args) {
        int arr[] = {0,10,0};
        int target = 0;
        System.out.println(perfectSum(arr, target));
    }
}
