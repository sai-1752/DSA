import java.util.*;

public class Dijkstra {
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.des=d;
            this.wt=w;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2,1 ));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair>{
        int node;
        int dis;
        
        public Pair(int node,int dis){
            this.node=node;
            this.dis=dis;
    
        }

        @Override
        public int compareTo(Pair p2){
            return this.dis-p2.dis;
        }
    }
    public static void dikstra(ArrayList<Edge> graph[],int src,int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>(); 
        int dis[]=new int[V];
        for (int i = 0; i <V; i++) {
            if (i!=src) {
                dis[i]=Integer.MAX_VALUE;
            }
        }
        boolean vis[]=new boolean[V];
        pq.add(new Pair(0,0));

        while (!pq.isEmpty()) {
            Pair curr=pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node]=true;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.des;

                    if (dis[u]+e.wt<dis[v]) {
                        dis[v]=dis[u]+e.wt;
                        pq.add(new Pair(v, dis[v]));
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.println(dis[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V=6;

        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        dikstra(graph, 0, V);
    }
}
