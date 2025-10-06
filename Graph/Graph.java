import java.util.*;
public class Solution{
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String args[]){
            int v=5;
            @SuppressWarnings("unchecked")
            ArrayList<Edge>[] graph=new ArrayList[v];
            for(int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<>();
            }
            //0->vertex
            graph[0].add(new Edge(0,1,5));
            //1->vertex
            graph[1].add(new Edge(1,2,1));
            graph[1].add(new Edge(1,3,3));
            //2->vertex
            graph[2].add(new Edge(2,3,1));
            graph[2].add(new Edge(2,4,2));
    }
}
