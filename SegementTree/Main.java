import java.util.*;
class Main{
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static int buildSt(int arr[],int i,int st,int end){
        if(st==end){
            tree[i]=arr[st];
            return arr[st];
        }
        int mid=(st+end)/2;
        buildSt(arr,2*i+1,st,mid);
        buildSt(arr,2*i+2,mid+1,end);
        tree[i]=tree[2*i+1]+tree[2*i+2];
        return tree[i];
    } 
    public static int getSumUtil(int i,int si,int sj,int qi,int qj){
        if(qi<=si && qj>=sj){
            return tree[i];
        }
        if(qi>sj || qj<si){
            return 0;
        }
        int mid=(si+sj)/2;
        return getSumUtil(2*i+1,si,mid,qi,qj)+getSumUtil(2*i+2,mid+1,sj,qi,qj);
    }
    public static int getSum(int n,int qi,int qj){
        return getSumUtil(0,0,n-1,qi,qj);
    }
    public static void updateUtil(int i,int si,int sj,int qi,int diff){
        if(qi<si || qi>sj){
            return;
        }
        tree[i]+=diff;
        if(si!=sj){
            int mid=(si+sj)/2;
            updateUtil(2*i+1,si,mid,qi,diff);
            updateUtil(2*i+2,mid+1,sj,qi,diff);
        }
    }
    public static void update(int n,int qi,int diff){
        updateUtil(0,0,n-1,qi,diff);
    }
    public static void updateRangeUtil(int i,int si,int sj,int qi,int qj,int diff){
        if(qi>sj || qj<si){
            return;
        }
        tree[i]+=(sj-si+1)*diff;
        if(si!=sj){
            int mid=(si+sj)/2;
            updateRangeUtil(2*i+1,si,mid,qi,qj,diff);
            updateRangeUtil(2*i+2,mid+1,sj,qi,qj,diff);
        }
    }
    public static void updateRange(int n,int qi,int qj,int diff){
        updateRangeUtil(0,0,n-1,qi,qj,diff);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildSt(arr,0,0,n-1);
        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
        System.out.println(getSum(n,0,3));
        update(n,0,5);
        System.out.println(getSum(n,0,3));
        updateRange(n,0,3,5);
        System.out.println(getSum(n,0,3));
    }
}
