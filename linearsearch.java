import java.util.*;
public class linearsearch{
public static int search(int arr[],int key){
for(int i=0;i<=arr.length;i++){
            if(arr[i]==key)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String args[]){
       int arr[]={23,34,32,342,31,32,12};
       int key=34;
       int index=search(arr,key);
       if (index==-1){
        System.out.print("not found");
       }
       else{
        System.out.println(index+1 +"");

       }
  
    }
}
