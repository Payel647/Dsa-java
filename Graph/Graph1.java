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
    public static void bfs(ArrayList<Edge>[]Graph){
                  boolean vis[]=new boolean[Graph.length];
                  for(int i=0;i<Graph.length;i++){
                    if(!vis[i]){
                     bfsUtil(Graph,vis);
                    }
                  }
    }
    public static void bfsUtil(ArrayList<Edge>[]Graph,boolean[]vis){
        Queue<Integer>q=new LinkedList<>();
        //added source->0
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
            System.out.print(curr+" ");
            vis[curr]=true;
            for(int i=0;i<Graph[curr].size();i++){
                Edge e=Graph[curr].get(i);
                    q.add(e.dest);
              }
            }
        }
    }
   public static void dfs(ArrayList<Edge>[]Graph){
                  boolean vis[]=new boolean[Graph.length];
                  for(int i=0;i<Graph.length;i++){
                    if(!vis[i]){
                     dfsUtil(Graph,vis,i);
                    }
                  }
    }
    public static void dfsUtil(ArrayList<Edge>[]Graph,boolean[]vis,int curr){
                   System.out.print(curr+" ");
                   vis[curr]=true;
                   for(int i=0;i<Graph[curr].size();i++){
                    Edge e=Graph[curr].get(i);
                    if(!vis[e.dest]){
                        dfsUtil(Graph,vis,e.dest);
                    }
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
            bfs(graph);
            System.out.println();
            dfs(graph);
    }
}
