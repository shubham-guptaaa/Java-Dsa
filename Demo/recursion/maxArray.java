class maxArray{
    public static int printMaxArray(int[] arr, int idx){
        int n = arr.length;
        if(idx==n-1){
            return arr[idx];
        }
        // small problem -> calculate the max value from idx+1 to last element of the arr

        int mx = printMaxArray(arr, idx+1);
        //self work
        if(arr[idx] > mx){
            return arr[idx];
        }
        return mx;
    }
    public static void main(String[] args) {
        // int[] arr = {5,6,8,3,7};
        int[] arr = {4,2,7,9,15,89,0};
        System.out.println(printMaxArray(arr, 0));
    }
}