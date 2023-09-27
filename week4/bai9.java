public class bai9 {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head = null;
        SinglyLinkedListNode chay = null;
        if(head1.data < head2.data){
            head = head1;
            chay = head1;
            head1 = head1.next;
        } else{
            head =head2;
            chay = head2;
            head2 = head2.next;
        }
        while(head1 != null && head2 != null ){
            if(head1.data <= head2.data){
                chay.next=head1;
                chay = chay.next;
                head1=head1.next;
            }else{
                chay.next=head2;
                chay=chay.next;
                head2=head2.next;
            }
        }
        while(head1 != null){
            chay.next=head1;
            chay=chay.next;
            head1=head1.next;
        }
        while(head2 != null){
            chay.next=head2;
            chay=chay.next;
            head2=head2.next;
        }
        return head;

    }
}
