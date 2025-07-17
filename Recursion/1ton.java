class Main {
    public static void dec(int n){
        if(n==0){
            return;
        }
        dec(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        dec(5);
    }
}
