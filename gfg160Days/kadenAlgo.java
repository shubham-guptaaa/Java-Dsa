package gfg160Days;

public class kadenAlgo {
    public static int maximumSum(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSum(arr));
    }
}
