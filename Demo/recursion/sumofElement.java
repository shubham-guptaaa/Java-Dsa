public class sumofElement {
    public static int sum(int[] arr, int idx){
        int sum;
        int n = arr.length;
        if(idx==n-1) return arr[idx];
        sum = sum(arr, idx+1);
        return sum+arr[idx];
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,20,1};
        int idx = 0;
        // int sum = 0;
        System.out.println((sum(arr, idx)));
    }
    
}
