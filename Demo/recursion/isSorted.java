public class isSorted {
    public static boolean issort(int arr[], int idx){
        int n = arr.length;
        if(idx == n-1) return true;
        if(arr[idx] > arr[idx + 1]){
            return false;
        }
        return issort(arr, idx + 1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 7};
        int idx = 0;
        System.out.println(issort(arr, idx));
    }
    
}
