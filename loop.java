class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}


public class loop {
    public static boolean cycle(ListNode head){
        ListNode turtle=head;
        ListNode hare=head.next;

        while (turtle!=hare) {
            if (hare==null||hare.next==null) {
                return false;
            }

            turtle=turtle.next;
            hare=hare.next.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next = head.next;

        boolean cycledetected=cycle(head);
        if (cycledetected) {
            System.out.println("the list has a cycle");
        }
        else{
            System.out.println("list doesnt contain cycle");
        }
    }
}
