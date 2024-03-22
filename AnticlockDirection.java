public class AnticlockDirection {
    

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int k = 2;
    
            // Rotate the array k times in anti-clockwise direction
            rotateArray(arr, k);
    
            // Print the rotated array
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    
        public static void rotateArray(int[] arr, int k) {
            // Create a temporary array to store the rotated elements
            int[] temp = new int[k];
    
            // Copy the first k elements of the original array to the temporary array
            for (int i = 0; i < k; i++) {
                temp[i] = arr[i];
            }
    
            // Move the remaining elements of the original array to the left
            for (int i = k; i < arr.length; i++) {
                arr[i - k] = arr[i];
            }
    
            // Copy the rotated elements from the temporary array to the original array
            for (int i = 0; i < k; i++) {
                arr[arr.length - k + i] = temp[i];
            }
            
        }
    }
    

