import java.util.LinkedList;
import java.util.Queue;
class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}


public class deletebt{
    public TreeNode deepestNode(TreeNode root){
        if (root==null) {
            return null;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        TreeNode current=null;

        while (!queue.isEmpty()) {
            current=queue.poll();

            if (current.left!=null) {
                queue.add(current.left);
            }
            if (current.right!=null) {
                queue.add(current.right);
            }
        }
        return current;
    }
    public void deletedeepestNode(TreeNode root,TreeNode deepestNode){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current=queue.poll();

            if (current.left!=null) {
                if (current.left==deepestNode) {
                    current.left=null;
                    return;
                }
                else{
                    queue.add(current.left);
                }
            }
            if (current.right!=null) {
                if (current.right==deepestNode) {
                    current.right=null;
                    return;
                }
                else{
                    queue.add(current.right);
                }
            }
        }
    }
    public TreeNode deleteNode(TreeNode root,int key){
        if (root==null) {
            return null;
        }
        if (root.left==null && root.right==null) {
            if (root.val==key) {
                return null;
            }
            else{
                return root;
            }
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        TreeNode toDelete=null;
        TreeNode current=null;

        while (!queue.isEmpty()) {
            current=queue.poll();

            if (current.val==key) {
                toDelete=current;
            }
            if (current.left!=null) {
                queue.add(current.left);
            }
            if (current.right!=null) {
                queue.add(current.right);
            }
        }
        if (toDelete!=null) {
            TreeNode deep=deepestNode(root);
            toDelete.val=deep.val;
            deletedeepestNode(root, deep);
        }
        return root;
    }
    public static void printTree(TreeNode root){
        if (root==null) {
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current=queue.poll();
            System.out.println(current.val+" ");

            if (current.left!=null) {
                queue.add(current.left);
            }
            if (current.right!=null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        deletebt Tree=new deletebt();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Before deletion:");
        printTree(root);

        int key = 3;
        Tree.deleteNode(root, key);

        System.out.println("\nAfter deleting node with value " + key + ":");
        printTree(root);
    }
}