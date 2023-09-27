public class bai7 {
    public  SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
        SinglyLinkedListNode head = llist;
        SinglyLinkedListNode next = null;
        SinglyLinkedListNode previous = null;
        while(head!=null){
            next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;

    }
}
