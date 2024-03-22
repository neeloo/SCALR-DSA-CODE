public class PairTringle {
    public static void main(String[] args) {
        int arr[]={0,1,2,3};
        int k=10;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
    
}
