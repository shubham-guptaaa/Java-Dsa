import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; // Handle empty array case

        Set<Integer> set = new HashSet<>();
        int l = 0, currSum = 0, maxSum = Integer.MIN_VALUE;
        int maxElement = nums[0]; // Start with first element

        for (int r = 0; r < n; r++) {
            maxElement = Math.max(maxElement, nums[r]); // Track max element

            while (set.contains(nums[r])) {
                set.remove(nums[l]);
                currSum -= nums[l];
                l++;
            }

            set.add(nums[r]);
            currSum += nums[r];

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    // Test function
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] testCases = {
            {4, 2, 4, 5, 6},      
            {5, 1, 2, 3, 5, 2},   
            {100},               
            {-1, -2, -3},        
            {1, 2, 3, 4, 5},     
            {10, 20, 10, 30, 40}, 
            {-100},
            {-4,-1,-4},
            {2,-10,6}                  
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = sol.maxSum(testCases[i]);
            System.out.println("Test Case " + (i + 1) + ": " + result);
        }
    }
}
