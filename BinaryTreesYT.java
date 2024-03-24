public class BinaryTreesYT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int index=-1;
        public static Node buildtree(int nodes[]){
            index++;
            if (index==-1||index>=nodes.length||nodes[index]==-1) {
                return null;
            }

            Node newNode=new Node(nodes[index]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);

            return newNode;
        }
        public void preorder(Node root){
            if (root==null) {
                return;
            }
            System.out.println(root.data + "");
            preorder(root.left);
            preorder(root.right); 

        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,3,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        tree.preorder(root);

    }
}