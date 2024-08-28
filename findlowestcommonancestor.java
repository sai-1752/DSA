class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
        this.val=val;
        left=null;
        right=null;
    }
}

public class findlowestcommonancestor {
    public static TreeNode common(TreeNode root,TreeNode n1,TreeNode n2){
        if (root==null||root==n1||root==n2) {
            return root;
        }
        TreeNode leftLCA=common(root.left, n1, n2);
        TreeNode rightLCA=common(root.right, n1, n2);

        if (leftLCA!=null && rightLCA!=null) {
            return root;
        }
        if (leftLCA!=null) {
            return leftLCA;
        }
        else{
            return rightLCA;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode n1=root.left;
        TreeNode n2=root.right.right;

        TreeNode lca=common(root, n1, n2);
        

        if (lca != null) {
            System.out.println("LCA of " + n1.val + " and " + n2.val + " is " + lca.val);
        } else {
            System.out.println("LCA not found");
        }
    }
}
