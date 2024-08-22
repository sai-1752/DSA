class Node{
    int val;
    Node left,right;

    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class heightbt {
    public static int height(Node root){
        if (root==null) {
            return -1;
        }
        
        int leftheight=height(root.left);
        int righthright=height(root.right);

        return 1+Math.max(leftheight, righthright);

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
