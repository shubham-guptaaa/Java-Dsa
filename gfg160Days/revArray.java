package gfg160Days;

class revArray {
    public static void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        // for(int i = n-1; i>=0; i--){
        //     System.out.print(arr[i]+" ");
        // }
        for(int i = 0; i<n/2; i++){
            int temp  = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        reverseArray(arr);
    }
}
