class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}

public class LLpalindrome {
    public static boolean ispalindrome(ListNode head){
        if (head==null||head.next==null) {
            return true;
        }
        ListNode slow,fast;
        slow=fast=head;
        
        while (fast.next!=null&&fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondhalf=reverse(slow.next);
        slow.next=null;

        ListNode p1=head;
        ListNode p2=secondhalf;
        while (p1!=null&&p2!=null) {
           if (p1.val!=p2.val) {
                return false;
           } 
           p1=p1.next;
           p2=p2.next;
        }
        return true;

    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode nextNode=null;
        
        while (current!=null) {
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        if (ispalindrome(head)) {
            System.out.println("the linked list is a palindrome");
        }
        else{
            System.out.println("the list is not a palindrome");
        }
    }
    
}
