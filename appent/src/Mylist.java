import org.w3c.dom.Node;

public class Mylist {
    MyNode head;
    static  class MyNode{
        String data;
        MyNode next;

        public MyNode(String data, MyNode next){
            this.data = data;
            this.next = next;
        }
        public MyNode(String data){
            this.data = data;
            this.next = null;
        }
    }
    static MyNode append (MyNode head, String data){
        if(head == null ){
            return  new MyNode(data);
        }
        head.next = append(head.next,data);
        return head;
    }
    static  MyNode removeFirst (MyNode head, String data){
        if(head == null ){
            return  null ;
        }
        if(head.data.equals(data)){
            return head.next;
        }
        head.next = removeFirst(head.next,data);
        return head;
    }
    static MyNode removeAll (MyNode head,String data){
        if(head == null ){
            return  null;
        }
        if(head.data.equals(data)){
            return removeAll(head.next,data);
        }
        head.next = removeAll(head.next,data);
        return head;
    }
    public void printList(){
        MyNode current = head;
        while (current!=null){
            System.out.print(current.data + " -> ");
            current=current.next;
        }
        System.out.println("null");

    }
}