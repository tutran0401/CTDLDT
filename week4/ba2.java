public class ba2 {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if(head == null ){
            return newNode;
        }
        SinglyLinkedListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;

    }

}
