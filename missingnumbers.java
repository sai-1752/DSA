class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
        this.val=val;
        left=right=null;
    }
}

public class missingnumbers {
    static int prevVal=Integer.MIN_VALUE;

    public static void findmissingnumbers(TreeNode root){
        if (root==null) {
            return;
        }
        findmissingnumbers(root.left);

        if (root.val-prevVal>1) {
            for (int i = prevVal+1; i < root.val; i++) {
                System.out.println(i+" ");
            }
        }
        prevVal=root.val;

        findmissingnumbers(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(10);

        System.out.println("Missing numbers in bst");
        findmissingnumbers(root);
    }
}
