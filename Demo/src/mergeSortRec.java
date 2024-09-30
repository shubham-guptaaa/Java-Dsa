import java.util.*;
public class mergeSortRec {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,7,1};
        int[] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));
        return merge(left, right);
    }
    private static int[] merge(int left[], int right[]){
        int ans[] = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                ans[k] = left[i];
                i++;
            }
            else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }
}
