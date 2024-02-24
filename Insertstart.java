public class Insertstart {
    Node head;
    private int size;

    Insertstart(){
        this.size=0;
    }
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addatstart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }   
    public void addatlast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head=newNode;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    public void deletefirst(){
        if (head==null) {
            System.out.println("list is empty");
            return;
        }
        else{
            size--;
            head=head.next;
        }
    }
    public void deletelast(){
        if (head==null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        if (head.next==null ) {
            head=null;
            return;
        }
        else{
            Node secondlastNode=head;
            Node lastNode=head.next;
            while (lastNode!=null) {
                lastNode=lastNode.next;
                secondlastNode=secondlastNode.next;
            }
            secondlastNode.next=null;
        }
    }
    public int getSize(){
        return;
    }
    public void printList(){
        if (head==null) {
            System.out.println("list is empty");
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Insertstart list = new Insertstart();
        list.addatstart(4   );
        list.addatstart(3);
        list.addatstart(2);
        list.addatstart(1);
        list.printList();

        list.addatlast(5);
        list.printList();
        list.deletefirst();
        list.printList();
        list.deletelast();
        list.printList();
        System.out.println(list.getSize());
    }
}
