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

public class subtree {
    public boolean areidentical(Node s,Node t){
        if (s==null && t==null) {
            return true;
        }
        if (s==null||t==null) {
            return false;
        }
        return (s.val==t.val) && areidentical(s.left, t.left) && areidentical(s.right, t.right);
    }

    public boolean issubtree(Node s,Node t){
        if (s==null) {
            return false;
        }
        if (areidentical(s, t)) {
            return true;
        }
        return issubtree(s.left, t)||issubtree(s.right, t);
    }
    public static void main(String[] args) {
        Node s=new Node(3);
        s.left = new Node(4);
        s.right = new Node(5);
        s.left.left = new Node(1);
        s.left.right = new Node(2);

        Node t=new Node(4);
        t.left=new Node(1);
        t.right=new Node(2);

        subtree solution=new subtree();
        System.out.println("is t a subtree of s "+solution.issubtree(s, t));
    }
}
