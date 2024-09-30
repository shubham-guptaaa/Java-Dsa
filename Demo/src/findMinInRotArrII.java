public class findMinInRotArrII {
    public static void main(String[] args) {
        int[] arr  ={10,1,10,10,10};
        System.out.println(findMin(arr));
    }
    static int findMin(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[left]<=arr[mid]){
                min = Math.min(min, arr[left]);
                left = mid+1;
            }
            else{
                min = Math.min(min, arr[min]);
            }
        }
        return min;
    }
    
}
