import java.util.Stack;

public class twostack {
    private static class Node {
        String iteam;
        Node next;
    }

    public static class Stack {
        private Node first = null;
        private int n;

        public boolean isEmpty() {
            return first == null;
        }

        public void push(String item) {
            Node old = first;
            first = new Node();
            first.iteam = item;
            first.next = old;
            n++;
        }

        public String pop() {
            String item = first.iteam;
            first = first.next;
            return item;
        }
    }
    public static class Queue2Stack{
        static Stack stack1 = new Stack();
        static Stack stack2 = new Stack();
        public boolean isEmpty(){
            return stack1.isEmpty() && stack2.isEmpty();
        }
        public static void enqueue(String item){
            stack1.push(item);
        }
        public static String dequeue(){
            if(stack2.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return  stack2.pop();
        }
    }

    public static void main(String[] args) {
        Queue2Stack my2Stack = new Queue2Stack();
        my2Stack.enqueue("1");
        my2Stack.enqueue("2");
        my2Stack.enqueue("3");

        while (!my2Stack.isEmpty()) System.out.println(my2Stack.dequeue());
    }
}
