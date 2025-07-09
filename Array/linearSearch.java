class Main {
    public static boolean linearSearch(int arr[],int key){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,34,12,36};
        System.out.print(linearSearch(arr,100));
    }
}
