public class bai10 {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        // Write your code here
        // ideas la dao nguoc ds xong truy cap.
        int count=0;
        SinglyLinkedListNode compe = llist;
        while(compe!= null){
            compe=compe.next;
            count++;
        }
        int posFromhead = count - positionFromTail - 1;
        for(int i=0; i<= posFromhead;i++){
            if(i< posFromhead){
                llist=llist.next;
                continue;
            }
            return llist.data;
        }

    }
}
