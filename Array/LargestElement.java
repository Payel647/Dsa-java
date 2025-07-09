class Main {
    public static int largestElement(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={16,34,12,36,10};
        System.out.print(largestElement(arr));
    }
}
