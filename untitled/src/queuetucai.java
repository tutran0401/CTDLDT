public class queuetucai {
    private static class Node {
        String iteam;
        Node next;
    }

    public static class Queue {
        private Node first, last;

        public boolean isEmpty() {
            return first == null;
        }

        public void enqueue(String item) {
            Node oldlast = last;
            last = new Node();
            last.iteam = item;
            last.next = null;
            if(isEmpty()) first=last;
            else oldlast.next=last;
        }

        public String dequeue() {
            String item = first.iteam;
            first = first.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue("1");
        myQueue.enqueue("2");
        myQueue.enqueue("3");
    while (!myQueue.isEmpty()) System.out.println(myQueue.dequeue());
    }
}
