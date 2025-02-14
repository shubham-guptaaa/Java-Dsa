public class subsetSum {
    public static void subsetsum(int[] arr, int n, int sum, int idx){
        if(idx==n){
            System.out.print(sum+" ");
            return;
        }
        subsetsum(arr, n, sum+arr[idx], idx+1);
        subsetsum(arr, n, sum, idx+1);
    }
    public static void main(String[] args) {
        int [] arr = {2,4,5};
        subsetsum(arr, arr.length, 0, 0);
    }
}
