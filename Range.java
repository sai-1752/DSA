public class Range {
    class Node{
        int val;
        Node left,right;

        Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static void printrange(Node root,int low,int high){
        if (root==null) {
            return;
        }
        if (low<root.val) {
            printrange(root.left, low, high);
        }
        if (low<=root.val && high>=root.val) {
            System.out.println(root.val+" ");
        }
        if (high>root.val) {
            printrange(root.right,low, high);
        }
    }
    public static void main(String[] args) {
        Range r=new Range();

        r.root=new Node(10);
        r.root.left = new Node(5);
        r.root.right = new Node(15);
        r.root.left.left = new Node(3);
        r.root.left.right = new Node(7);
        r.root.right.right = new Node(18);

        int low=5;
        int high=15;
        System.out.println("Nodes within the range["+low+" ,"+ high +"]:");
        r.printrange(r.root, low, high);
    }
}
