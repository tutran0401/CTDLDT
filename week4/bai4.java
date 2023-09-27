public class bai4 {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = llist;
        if(position == 0 ){
            newNode.next = llist;
            return newNode;
        }
        int count =1;
        while(count < position){
            current=current.next;
            count++;
        }
        SinglyLinkedListNode tmp = current.next;
        newNode.next = tmp;
        current.next = newNode;
        return llist;
    }

}
}
