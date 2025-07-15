import java.util.*;
class Main {
    //step-1
    // public static boolean duplicateArr(int arr[]){
    //     Arrays.sort(arr);
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]==arr[i+1]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // step-2
    public static boolean duplicateArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(duplicateArr(nums));
    }
}
