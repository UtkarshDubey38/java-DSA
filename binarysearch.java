public class binarysearch {
    public static int search(int arr[],int key){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]==key)
        return mid;
        else if(arr[mid]<key)
        start=mid+1;
        else
        end=mid-1;
        }
        return -1;
    }
    public static void main(String args[]){
      int arr[]={23,32,43,53,64,75,85,986};
      int key=32;
      int index=search(arr,key);
      if(index==-1)
      System.out.println("not found");
      else
      System.out.println(index+1 +" is the postion-");  
    }
}
