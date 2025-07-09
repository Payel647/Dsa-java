class Main {
    public static boolean binarySearch(int arr[],int key){
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==key){
                return true;
            }else if(arr[mid]<key){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={16,34,12,36,10};
        System.out.print(binarySearch(arr,36));
    }
}
