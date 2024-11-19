package gfg160Days;
public class nextPermutation {
    private static void reverse(int[] arr, int start, int end){
        while(start>end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    private static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void nexPermut(int[] arr){
        int n = arr.length;
        int idx = -1;
        for(int i = n-2; i>=0; i++){
            if(arr[i]<arr[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(arr, 0, n-1);
        }
        for(int i = n-1; i>=idx; i--){
            if(arr[i]>arr[idx]){
             swap(arr, idx, i);
            }
        }
            reverse(arr, idx+1, n-1);

    }
    public static void main(String[] args) {
        int arr[] = {2,3,0,0,1,4,5};
        nexPermut(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
