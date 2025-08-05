import java.util.*;
public class Main{
  public static int tilingProblem(int n){
    if (n==1||n==0) return 1;
    //horijontal 
    int h1=tilingProblem(n-1);
    //vertical 
    int h2=tilingProblem(n-2);
    return h1 + h2;
  }
    public static void main(String[] args) {
      System.out.print(tilingProblem(4));
    }
}
