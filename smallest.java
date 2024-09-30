public class smallest{
    public static int getsmall(int arr[]){
        int smallest=Integer.MAX_VALUE;    
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int arr[]={32,41,43,2,12,45};
        int small=getsmall(arr);
        System.out.println(small);
    }
}
