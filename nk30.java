class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class nk30 {
    public static boolean LLlengtheven(ListNode head){
        int count=0;
        ListNode current=head;
        while (current!=null) {
            count++;
            current=current.next;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        if (LLlengtheven(head)) {
            System.out.println("the list is even");
        }
        else{
            System.out.println("the list is odd");
        }
    }
}
