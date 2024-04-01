import java.util.ArrayList;

public class cycledetection {
    static class Edge{
        int src;
        int des;

        public Edge(int s,int d){
            this.src=s;
            this.des=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));

    }

    public static boolean iscycledirected(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);

            if (rec[e.des]) {
                return true;
            }
            else if (!vis[e.des]) {
                if(iscycledirected(graph, vis, e.des, rec)){
                    return true;
                }
            }
        }
        rec[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        int V=4;

        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        System.out.println(iscycledirected(graph,new boolean[V], 0, new boolean[V]));
    }
}
