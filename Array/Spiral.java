//Spiral Matrix
import java.util.*;
public class Solution{
    
    public static void main(String args[]){
       int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       int stRow=0;
       int enRow=mat.length-1;
       int stCol=0;
       int enCol=mat[0].length-1;
       while(stRow<=enRow && stCol<=enCol){
        for(int i=stCol;i<=enCol;i++){
            System.out.print(mat[stRow][i]+" ");
        }
        System.out.println();
        for(int i=stRow+1;i<=enRow;i++){
            System.out.print(mat[i][enCol]+" ");
        }
        System.out.println();
        for(int i=enCol-1;i>=stCol;i--){
            if(stRow==enRow){
                break;
            }
            System.out.print(mat[enRow][i]+" ");
        }
        System.out.println();
        for(int i=enRow-1;i>stRow;i--){
             if(stCol==enCol){
                break;
            }
            System.out.print(mat[i][stCol]+" ");
        }
        System.out.println();
        stCol++;
        stRow++;
        enCol--;
        enRow--;
       }
    }
}
