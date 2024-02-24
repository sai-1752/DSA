class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class NK28 {
    public static ListNode findmiddleofLL(ListNode head){
        ListNode ptr1x=head;
        ListNode ptr2x=head;
        int i=0;

        while (ptr1x.next!=null) {
            if (i==0) {
                ptr1x=ptr1x.next;
                i=1;
            }
            else if(i==1){
                ptr1x=ptr1x.next;
                ptr2x=ptr2x.next;
                i=0;
            }
        }
        return ptr2x;
    }
    public static void main(String[] args) {
        ListNode head =new ListNode(1);
        head.next=new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle =findmiddleofLL(head);
        if (middle!=null) {
            System.out.println("the middle if the linked list is"+middle.val);
        }
        else{
            System.out.println("list is empty");
        }
    }
}
