public class maxsubarray {
    public static void maxsubarray(int arr[]){
        int maxsub=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int end=j;
                int currsum=0;
                for(int k=i;k<=end;k++){
                    currsum+=arr[k];
                    
                }
                if(maxsub<currsum)
                maxsub=currsum;
            }
        } 
        System.out.println(maxsub);
    }
    public static void main(String args[]){
        int arr[]={2,4,3,5,6};
        maxsubarray(arr);
    }
}
