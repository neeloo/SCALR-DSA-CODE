
   public class Arrays {

    public static void main(String[] args) {
        

        // find maximum element in array************
         int arr[]={1,3,4,5,2,3,4,8};
         int max=arr[0]; 
         for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];  
            }  
         }
         //System.out.println(max);

         
         //count frequncy of element**************
         int count=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                count++;
            }
         }
         System.out.println(arr.length-count);

        
        
    }
    
}

