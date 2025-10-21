//selection sort
import java.util.*;
public class Solution{
    
    public static void main(String args[]){
       int arr[]={5,4,1,3,2};
       for(int i=0;i<arr.length-1;i++){
        int min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
       }
       for(int i:arr){
        System.out.print(i+" ");
       }
    }
}
