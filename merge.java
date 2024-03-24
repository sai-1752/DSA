class ListNode{
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
public class merge {
    public static ListNode mergeSort(ListNode head){
        if (head==null||head.next==null) {
            return head;
        }

        ListNode middle=getMiddle(head);
        ListNode nextMiddle=middle.next;
        middle.next=null;

        ListNode firsthalf =mergeSort(head);
        ListNode seconhalf=mergeSort(nextMiddle);

        return merge(firsthalf,seconhalf);
    }

    public static ListNode getMiddle(ListNode head){
        if (head==null) {
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;

        while (fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode left,)
}
