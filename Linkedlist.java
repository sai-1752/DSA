public class Linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    public static Linkedlist insert(Linkedlist list, int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(Linkedlist list) {
        Node currentNode = list.head;
        System.out.println("LinkedList: ");

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();

        l = insert(l, 1);
        l = insert(l, 2);
        l = insert(l, 3);
        l = insert(l, 4);
        l = insert(l, 5);
        l = insert(l, 6);

        printList(l);
    }
}