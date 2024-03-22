import java.util.Arrays;

public class RotaedArray {
    public static void main(String[] args) {
     //rotated array for k time at clockwise direction***********
     
        int num[] = { 1, 2, 3, 4, 5 };
        // for 1 time=5,1,2,3,4
        // for 2 time= 4,5,,1,2,3
        // for 3 time=3,4,5,1,2
        int k = 3;
        rotated(num, k);
        System.out.println(Arrays.toString(num));
    }

    private static void rotated(int[] num, int k) {

        k = k % num.length;
        // for first part (start to mid element are reverse)
        reverse(num, 0, num.length - k - 1);

        // for second part (mid to last element was reverse)
        reverse(num, k - 1, num.length - 1);

        // for hole array reverse(start to end element was reverse)
        reverse(num, 0, num.length - 1);
    }

    private static void reverse(int[] num, int i, int j) {

        while (i < j) {
            swap(num, i, j);
            i++;
            j--;
        }

    }

    private static void swap(int[] num, int i, int j) {

        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

}
