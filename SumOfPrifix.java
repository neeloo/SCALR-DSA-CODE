public class SumOfPrifix {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int q=3;
        int[] prefixSum = new int[arr.length];

        // Calculate the prefix sum
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Print the prefix sum
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.println(prefixSum[i]);
        }

        //prifix sum of given range [i,j] and query q
        for(int i=0;i<=q;i++){
            
        }
    }
    
}
