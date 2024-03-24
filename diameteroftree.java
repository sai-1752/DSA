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

public class diameteroftree {
    public static int height(Node root){
        if (root==null) {
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        return Math.max(leftheight, rightheight)+1;
    }
    public static int diameter(Node root){
        if (root==null) {
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;

        return Math.max(diam3,Math.max(diam1, diam2));
    }
    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        if (root==null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);

        int myheight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=Math.max(diam1, diam2);

        int mydiam=Math.max(Math.max(diam1, diam2),diam3);

        TreeInfo myInfo=new TreeInfo(myheight, mydiam);
        return myInfo;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        int result=diameter(root);
        System.out.println("Diameter of the tree is: "+result);
    }
}
