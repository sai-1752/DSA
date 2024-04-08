import java.util.*;
class Edge implements Comparable<Edge>{
    int src,des,wt;
    
    public Edge(int src,int des,int wt){
        this.src=src;
        this.des=des;
        this.wt=wt;
    }
    @Override
    public int compareTo(Edge other){
        return this.wt-other.wt;
    }
}

public class krushkals {
    private int V;
    private List<Edge> edges;

    public KrushkalsAlgorithm(int V){
        this.V=V;
        edges=new ArrayList<>();
    }
    public void addedge(int src,int des,int wt){
        edges.add(new Edge(src, des, wt));
    }
    public List<Edge> krushkalMST(){
        List<Edge> mst=new ArrayList<>();
        Collections.sort(edges);
        
        int[] parent=new int[V];
        Arrays.fill(parent, -1);

        int edgecount=0;
        int i=0;

        while (edgecount<V-1 && i< edges.size()) {
            Edge nextEdge=edges.get(i++);
            int x=find(parent,nextEdge.src);
            int y=find(parent,nextEdge.des);

            if (x!=y) {
                mst.add(nextEdge);
                union(parent,x,y);
                edgecount++;
            }
        }
        return mst;
    }
    public int find(int[] parent,int i){
        if (parent[i]==-1) 
            return i;
        return parent[i]=find(parent, parent[i]);
    }
    private void union(int[] parent,int x,int y){
        int xSet=find(parent, x);
        int ySet=find(parent, y);

        if (xSet!=ySet) {
            if (parent[xSet]<parent[ySet]) {
                parent[xSet]+=parent[ySet];
                parent[xSet]=ySet;
            }
            else{
                parent[ySet]+=parent[xSet];
                parent[xSet]=ySet;
            }
        }
    }
    public static void main(String[] args) {
        int V=4;
        KrushkalsAlgorithm graph=new KrushkalsAlgorithm(V);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);

        List<Edge> mst=graph.krushkalMST();
        System.out.println("Edges in minimum spanning tree: ");
        for (Edge edge : mst) {
            System.out.println(edge.src+"-"+edge.des+":"+edge.wt);
        }
    }
}
