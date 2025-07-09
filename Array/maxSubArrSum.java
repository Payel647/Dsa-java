class Main {
    public static int maxSubArr(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           int st=i;
           for(int j=i;j<n;j++){
               int end=j;
               int sum=0;
              for(int k=st;k<=end;k++){
                 sum+=arr[k];
              }
              if(max<sum){
                  max=sum;
              }
           }
       }
       return max;
    }
    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        System.out.print(maxSubArr(arr));
    }
}
