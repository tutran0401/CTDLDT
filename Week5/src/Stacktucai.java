public class Stacktucai {
    private static class Node{
        String iteam;
        Node next;
    }
    public static class Stack{
        private Node first = null;
        private int n;
        public boolean isEmpty(){
            return first ==null;
        }
        public void push(String item){
            Node old = first;
            first = new Node();
            first.iteam=item;
            first.next=old;
            n++;
        }
        public String pop(){
            String item = first.iteam;
            first=first.next;
            return item;
        }

        public static void main(String[] args) {
        Stack  mystack =  new Stack();
            mystack.push("one");
            mystack.push("two");
            mystack.push("three");
            while (!mystack.isEmpty()) System.out.println(mystack.pop());
        }
    }
}
