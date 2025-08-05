import java.util.*;
public class Main{
  public static void merge(int arr[],int st,int mid,int end){
    int i=st;
    int j=mid+1;
    int k=0;
    int temp[]=new int[end-st+1];
    while(i<mid+1 && j<=end){
      if(arr[i]<=arr[j]){
        temp[k]=arr[i];
        k++;
        i++;
      }else{
        temp[k]=arr[j];
        k++;
        j++;
      }
    }
    while(i<mid+1){
      temp[k]=arr[i];
      k++;
      i++;
    }
    while(j<=end){
      temp[k]=arr[j];
      k++;
      j++;
    }
    for(int l=0;l<temp.length;l++,st++){
      arr[st]=temp[l];
    }
  }
  public static void mergeSort(int arr[],int st,int end){
           if(st>=end) return;
           int mid=st+(end-st)/2;
           mergeSort(arr,st,mid);
           mergeSort(arr,mid+1,end);
           merge(arr,st,mid,end);
  }
    public static void main(String[] args) {
      int arr[]={6,2,5,3};
      mergeSort(arr,0,arr.length-1);
       for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    }
}
