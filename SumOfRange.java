public class SumOfRange {
    public static void main(String[] args) {
        
        int arr[]={3,6,2,4,5,2,8,-9,3,1};
        int sum=0; 
        int l=6;
        int r=9;
        int k=5;
        for(int i=0;i<=k; i++){
            for(int j=l;j<=r;j++){
                sum+=arr[j];
            }
            
            System.out.println(sum);
            return;
        }
       
    }
    
}
