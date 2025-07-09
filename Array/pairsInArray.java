class Main {
    public static void pairsInArr(int arr[]){
        int n=arr.length;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               System.out.print("("+arr[i]+","+arr[j]+")");
           }
       }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        pairsInArr(arr);
    }
}
