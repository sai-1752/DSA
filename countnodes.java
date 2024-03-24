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

public class countnodes{
    public static int count(Node root){
        if (root==null) {
            return 0;
        }
        return 1+count(root.left)+count(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int nodecount=count(root);
        System.out.println("number of nodes in binary tree is : "+nodecount);

    }
}