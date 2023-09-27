public class bai1 {
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode tempNext = head;
        while (tempNext != null) {
            System.out.println(tempNext.data);
            tempNext = tempNext.next;
        }
        //dequy
        /* if( head == null) return;
            System.out.println(head.data);
            printLinklist(head.next);
         */
    }
}