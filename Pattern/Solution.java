import java.util.*;
public class Solution{
    public static void Star(int n){
        for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++){
            System.out.print("*");
        }
        System.out.println();
       }
       for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    public static void ButterFly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void namePrint(String str){
        int count=1;
        for(int i=0;;){
            int temp=count;
            while(temp>0){
               if(i<str.length()){
                  System.out.print(str.charAt(i)+" ");  
               }else{
                   System.out.print("*"+" ");
               }
               temp--;
               i++;
            }
            System.out.println();
            if(i>str.length()){
                break;
            }
            count++;
        }
    }
    public static void Hollowsquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number Of Line: ");
        int n=sc.nextInt();
        Star(n);
        ButterFly(n);
        System.out.print("Enter Your Name : ");
        String name=sc.next();
        namePrint(name);
        Hollowsquare(n);
    }
}
