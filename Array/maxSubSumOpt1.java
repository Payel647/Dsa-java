class Main {
    public static int maxSubArr(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int [n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
       for(int i=0;i<n;i++){
           int st=i;
           for(int j=i;j<n;j++){
               int end=j;
               int sum=0;
               sum=st==0?prefix[end]:prefix[end]-prefix[st-1];
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
