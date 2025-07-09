class Main {
    public static void printSubArr(int arr[]){
        int n=arr.length;
       for(int i=0;i<n;i++){
           int st=i;
           for(int j=i;j<n;j++){
               int end=j;
              for(int k=st;k<=end;k++){
                  System.out.print(arr[k]);
              }
              System.out.println();
           }
       }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubArr(arr);
    }
}
