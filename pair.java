public class pair {
    public static void getpair(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
public static void main(String args[]){
int arr[]={2,4,3,5,3};
getpair(arr);

}
}
