class Node{
    int val;
    Node left;
    Node right;
    
    Node(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}

public class sumofroottoleaf {
    public int sumroot(Node root){
        return helper(root,0);
    }

    public static int helper(Node root,int sum){
        if (root==null) {
            return 0;
        }
        sum=(sum<<1)+root.val;

        if (root.left==null && root.right==null) {
            return sum;
        }
        return helper(root.left, sum) + helper(root.right, sum);
    }
    public static void main(String[] args) {
        sumofroottoleaf solution=new sumofroottoleaf();
        Node root=new Node(1);
        root.left=new Node(0);
        root.right = new Node(1);
        root.left.left = new Node(0);
        root.left.right = new Node(1);
        root.right.left = new Node(0);
        root.right.right=new Node(1);

        int result=solution.sumroot(root);
        System.out.println(result);
    }
    
}
