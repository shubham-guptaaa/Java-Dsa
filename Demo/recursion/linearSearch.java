public class linearSearch {
    public static boolean search(int[] arr, int target, int idx){
        int n = arr.length;
        if(idx==n){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        return search(arr, target, idx+1);

    }
    public static void main(String[] args) {
        int[] arr = {4,12,54,14,3,8,6,1};
        int target = 14;
        int idx = 0;
        if(search(arr, target, idx)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
