class Main {
    public static void reverseArr(int arr[]){
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={16,34,12,36,10};
        reverseArr(arr);
       for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
        }
    }
}
