public class BST {
    static class Node {
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node insert(Node root,int val){
        if (root==null) {
            root=new Node(val);
            return root;
        }

        if (val<root.data) {
            root.left=insert(root.left, val);
        }

        else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if (root==null) {
            return false;
        }

        if (key<root.data) {
            return search(root.left,key);
        }
        else if (root.data==key) {
            return true;
        }
        else{
            return search(root.right,key);
        }
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for (int i = 0; i < values.length; i++) {
            root=insert(root,values[i]);
        }
        inorder(root);

        if (search(root,1)) {
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
