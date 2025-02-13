public class traverseLast {
    public static int findTraget(int arr[], int target, int n){
        if(n==0) return -1;
        if(arr[n-1]==target){
            return n-1;
        }
        return findTraget(arr, target, n-1);

    }
    public static void main(String[] args) {
        //traverse form the last idx and find the target element;
        int arr[] = {1,3,9,2,6,7};
        int n = arr.length;
        int target = 1;
        System.err.println(findTraget(arr, target, n));


    }
}
