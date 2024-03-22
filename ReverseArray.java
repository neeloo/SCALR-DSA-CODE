import java.util.Arrays;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {

        // find maximum element in array************
        /*
         * int arr[] = { 1, 3, 4, 5, 2, 3, 4, 8 };
         * int max = arr[0];
         * for (int i = 1; i < arr.length; i++) {
         * if (arr[i] > max) {
         * max = arr[i];
         * }
         * }
         * // System.out.println(max);
         * 
         * // count frequncy of element**************
         * int count = 0;
         * for (int i = 0; i < arr.length; i++) {
         * if (arr[i] == max) {
         * count++;
         * }
         * }
         * System.out.println(arr.length - count);
         */

        // Q-2
        // int a[] = { 3, -2, 1, 4, 3, 6, 8 };
        // int k = 10;
        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a.length; j++) {
        // if (i != j) {
        // if (a[i] + a[j] == k)
        // System.out.println("true");
        // }
        // }
        // }
        // System.out.println("false");

        // int n[] = { 0,1,2,3 };
        // int s = 4;
        // for(int i=0;i<n.length;i++){
        // for(int j=i+1;j<n.length;j++){
        // if(n[i]+n[j]==s)
        // System.out.println("true");
        // }
        // }

        // reverse arr****************
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int n = arr.length;
        // for (int i = 0; i < n / 2; i++) {
        // int temp = arr[i];
        // arr[i] = arr[n - 1 - i];
        // arr[n - 1 - i] = temp;
        // }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]+",");
        // }

        // Question -3
        int k[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        rev(k);
        
        System.out.print(Arrays.toString(k));
    }

    static void rev(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(i,j,arr);
            i++;
            j--;
        }

    }

    private static void swap(int i, int j,int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
