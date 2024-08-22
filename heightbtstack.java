import java.util.Stack;

class Node{
    int val;
    Node left,right;

    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class heightbtstack {
    public static int height(Node root){
        if (root==null) {
            return -1;
        }
        Stack<Nodedepth> stack=new Stack<>();
        stack.push(new Nodedepth(root,0));
        int maxHeight=0;

        while (!stack.isEmpty()) {
            Nodedepth current=stack.pop();
            Node currentNode=current.node;
            int currentDepth=current.depth;

            if (currentNode!=null) {
                maxHeight=Math.max(maxHeight, currentDepth);

                stack.push(new Nodedepth(currentNode.left,currentDepth+1));
                stack.push(new Nodedepth(currentNode.right,currentDepth+1));
            }
        }
        return maxHeight;
    }
    static class Nodedepth{
        Node node;
        int depth;

        Nodedepth(Node node,int depth){
            this.node=node;
            this.depth=depth;
        }
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int treeheight=height(root);
        System.out.println(treeheight);
    }
}
