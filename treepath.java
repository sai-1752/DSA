import java.util.ArrayList;
import java.util.List;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class treepath {
    public List<String> binarytreepaths(Node root){
        List<String> paths=new ArrayList<>();
        if (root==null) {
            return paths;
        }
        dfs(root," ",paths);
        return paths;
    }
    public void dfs(Node node,String path,List<String>paths){
        path+=node.val;

        if (node.left==null && node.right==null) {
            paths.add(path);
            return;
        }

        if (node.left!=null) {
            dfs(node.left, path+"-> ", paths);
        }

        if (node.right!=null) {
            dfs(node.right, path+"->", paths);
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.right=new Node(5);

        treepath solution=new treepath();
        List<String> paths=solution.binarytreepaths(root);

        System.out.println("Paths from root node to leaf node: ");
        for(String path: paths){
            System.out.println(path);
        }
    }
}
