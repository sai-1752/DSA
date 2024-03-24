public class path {
    Node root;
    static class Node{
        int val;
        Node left,right;

        Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static Node insert(Node root,int val){
        if (root==null) {
            root=new Node(val);
            return root;
        }

        if (val<root.val) {
            root.left=insert(root.left, val);
        }

        else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void printpath(Node root,String path){
        if (root==null) {
            return;
        }
        path+=root.val+"->";

        if (root.left==null && root.right==null) {
            System.out.println(path);
            return;
        }

        printpath(root.left, path);
        printpath(root.right, path);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for (int i = 0; i < values.length; i++) {
            root=insert(root, values[i]);
        }

        printpath(root," ");
    }
}
