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

public class DeepestNode {
    public TreeNode finddeepestNode(TreeNode root){
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
    public static void main(String[] args) {
        DeepestNode tree = new DeepestNode();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(7);

        TreeNode deepestNode=tree.finddeepestNode(root);
        if (deepestNode!=null) {
            System.out.println(deepestNode.val);
        }
        else{
            System.out.println("tree is empty");
        }
    }
}
