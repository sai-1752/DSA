import java.util.*;
public class insertionbt {
    static class Node {
        int val;
        Node left,right;
    
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    static Node root;
    static Node temp=root;
    static void inorder(Node temp){
        if (temp==null) {
            return;
        }

        inorder(temp.left);
        System.out.println(temp.val+" ");
        inorder(temp.right);
    }

    static void insert(Node temp,int val){
        if(temp==null){ 
            root=new Node(val);
            return;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(temp);

        while (!q.isEmpty()) {
            temp=q.peek();
            q.remove();

            if(temp.left==null){
                temp.left=new Node(val);
                break;
            }
            else
                q.add(temp.left);
            if(temp.right==null){
    
                temp.right=new Node(val);
                break;
            }
            else{
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
        
        System.out.println("inorder travaersal before insertion");

        inorder(root);

        int val=12;
        insert(root,val);

        System.out.println("inorder traversal after insertion");

        inorder(root);
    }
}
