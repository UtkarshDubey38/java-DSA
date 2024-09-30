public class subarray {
    public static void getsubarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=i;k<=end;k++){
                    sum=sum+arr
                    System.out.print(arr[k]+"");
                }
                System.out.println();
            }
            System.out.println();
        } 
    }
    public static void main(String args[]){
        int arr[]={2,4,3,5,6};
        getsubarray(arr);
    }
}
