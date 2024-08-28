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

public class findingleaves {
    public int countleaves(TreeNode root){
        if (root==null) {
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int leafCount=0;

        while (!queue.isEmpty()) {
            TreeNode current=queue.poll();

            if (current.left==null && current.right==null) {
                leafCount++;
            }
            if (current.left!=null) {
                queue.add(current.left);
            }
            if (current.right!=null) {
                queue.add(current.right);
            }
        }
        return leafCount;
    }
    public static void main(String[] args) {
        findingleaves tree=new findingleaves();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(tree.countleaves(root));
    }
}
