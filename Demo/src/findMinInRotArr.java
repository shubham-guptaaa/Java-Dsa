public class findMinInRotArr {
    public static void main(String[] args) {
        int arr[] = {11,12,11,12,13};
        System.out.println(find(arr));
    }
    public static int find(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[left]<=arr[mid]){
                min = Math.min(min, arr[left]);
                left = mid+1;
            }
            else{
                min = Math.min(min, arr[mid]);
                right = mid-1;
            }
        }
        return min;
    }
    
}
