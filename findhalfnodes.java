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

public class findhalfnodes {
    public int halfNode(TreeNode root){
        if (root==null) {
            return 0;
        }
        int count=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
          TreeNode current=queue.poll();
          
          if ((current.left!=null && current.right==null) || (current.left==null && current.right!=null)) {
            count++;
          }

          if (current.left!=null) {
            queue.offer(current.left);
          }
          if (current.right!=null) {
            queue.offer(current.right);
          }
        }
        return count;
    }
    public static void main(String[] args) {
        findhalfnodes tree=new findhalfnodes();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.println(tree.halfNode(root));
    }
}
