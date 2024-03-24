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
public class treeheight {
    public static int height(Node root){
        if (root==null) {
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        return Math.max(leftheight, rightheight)+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int result=height(root);
        System.out.println("height of the tree is: "+result);
    }
}

