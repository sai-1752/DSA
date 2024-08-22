class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}

public class minimumdepth {
    public int mindepth(TreeNode root){
        if (root==null) {
            return 0;
        }

        if (root.left==null) {
            return mindepth(root.right)+1;
        }
        if (root.right==null) {
            return mindepth(root.left)+1;
        }
        return Math.min(mindepth(root.left), mindepth(root.right))+1;
    }

    public static void main(String[] args) {
        minimumdepth tree=new minimumdepth();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(tree.mindepth(root));
    }
}
