import java.util.*;

public class Prims {
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

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    } 
    public static void primsalgorithm(ArrayList<Edge> graph[],int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[V];
        pq.add(new Pair(0, 0));

        int mstcost=0;

        while (!pq.isEmpty()) {
            Pair curr=pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node]=true;
                mstcost+=curr.cost;

                for (int i = 0; i <graph[curr.node].size(); i++) {
                    Edge e=graph[curr.node].get(i);
                    if (!vis[e.des]) {
                        pq.add(new Pair(e.des,e.wt));
                    }
                }
            }
        }
        System.out.println("min cost of mst is: "+mstcost);
    }
    public static void main(String[] args) {
        int V=4;

        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        primsalgorithm(graph, V);
    }
}
