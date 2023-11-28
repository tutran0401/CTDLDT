import java.util.Hashtable;
import java.util.Scanner;

public class RemoveDuplicatesLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Nhập số lượng phần tử của danh sách liên kết:");
        int n = scanner.nextInt();

        System.out.println("Nhập các phần tử của danh sách liên kết:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Danh sách liên kết ban đầu:");
        printLinkedList(head);

        removeDuplicates(head);

        System.out.println("\nDanh sách liên kết sau khi xóa phần tử trùng nhau:");
        printLinkedList(head);

        scanner.close();
    }

    public static void removeDuplicates(Node head) {
        Hashtable<Integer, Boolean> hashtable = new Hashtable<>();
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (hashtable.containsKey(current.data)) {
                previous.next = current.next;
            } else {
                hashtable.put(current.data, true);
                previous = current;
            }
            current = current.next;
        }
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
