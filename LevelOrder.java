import java.util.*;

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
public class LevelOrder {
    public static void levelorder(Node root){
        if (root==null) {
            return;
        }

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node curr=queue.remove();
            System.out.println(curr.val + " ");

            if (curr.left!=null) {
                queue.add(curr.left);
            }
            if (curr.right!=null) {
                queue.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("level order traversal");
        levelorder(root);
    }
}
