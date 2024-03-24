class TreeNode{
    int val;
    TreeNode left,right;

    TreeNode(int val){
        this.val=val;
        left=right=null;
    }
}

public class missingnumbersinrange{
    static int prevVal=Integer.MAX_VALUE;

    public static void findmissingnumbers(TreeNode root,int low,int high){
        if (root==null) {
            return;
        }

        findmissingnumbers(root.left, low, high);

        if (root.val>=low&&root.val<=high) {
            
            if (root.val-prevVal>1) {
                for(int i=prevVal+1;i<root.val;i++){
                    System.out.println(i+" ");
                }
            }
            prevVal=root.val;
        }

        findmissingnumbers(root.right, low, high);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(10);

        int low=4,high=9;
        System.out.println("missing numbers in the range ["+low+","+high+"]:");
        findmissingnumbers(root, low, high);        

    }
}