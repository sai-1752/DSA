import java.util.ArrayList;

public class Classroom {
    static class Edge{
        int src;
        int des;
        int weight;

        public Edge(int src,int des,int weight){
            this.src=src;
            this.des=des;
            this.weight=weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2,1)); 

        graph[1].add(new Edge(1,2,35)); 
        graph[1].add(new Edge(1,3,8)); 
        
        graph[2].add(new Edge(2,0,4)); 
        graph[2].add(new Edge(2,1,3)); 
        graph[2].add(new Edge(2,3,2)); 

        graph[3].add(new Edge(3,1,0)); 
        graph[3].add(new Edge(3,2,5)); 

    
    }

    public static void main(String[] args) {
        int ver=4;
        ArrayList<Edge> graph[] =new ArrayList[ver]; 
        createGraph(graph);
        for (int i = 0; i < graph[3].size(); i++) {
            Edge e=graph[3].get(i);
            System.out.println(e.weight+" ,"+e.des);
        }
    }
}
