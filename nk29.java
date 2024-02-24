class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class nk29 {
    public static void printlistfromtheend(ListNode head){
        if (head==null) {
            return;
        }
        printlistfromtheend(head.next);
        System.out.println(head.val);
    }

    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        head.next=new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printlistfromtheend(head);
    }
}