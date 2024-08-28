class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}

public class btisbst {
    private static Integer prevVal=null;

    public static boolean isBST(TreeNode root){
        if (root==null) {
            return true;
        }
        if (!isBST(root.left)) {
            return false;
        }
        if (prevVal!=null && root.val<=prevVal) {
            return false;
        }
        prevVal=root.val;

        return isBST(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        if (isBST(root)) {
            System.out.println("the tree is a binary search tree");
        }
        else{
            System.out.println("the tree is not ");
        }
    }
}
