public class linerarSeachII {
    public static int searchIdx(int[] arr, int target, int idx){
        int n = arr.length;
        if(idx==n) return -1;
        if(arr[idx]==target) return idx;
        return searchIdx(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {4,12,54,14,3,8,6,1};
        int target = 14;
        int idx = 0;
        System.out.println(searchIdx(arr, target, idx));

    }
}
