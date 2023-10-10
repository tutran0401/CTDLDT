//package edu.princeton.cs.algs4;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class bai1 {
    public class Stack<Item> implements Iterable<Item> {
        private Node<Item> first;     // top of stack
        private int n;                // size of the stack

        // helper linked list class
        private static class Node<Item> {
            private Item item;
            private Node<Item> next;
        }

        /**
         * Khởi tạo một ngăn xếp trống.
         */
        public Stack() {
            first = null;
            n = 0;
        }

        /**
         * Trả về true nếu ngăn xếp này trống.
         *
         * @return đúng nếu ngăn xếp này trống va nguoc lai
         */
        public boolean isEmpty() {
            return first == null;
        }

        /**
         * Returns số phần tử trong ngăn xếp này.
         *
         * @return the number of items in this stack
         */
        public int size() {
            return n;
        }

        /**
         * Thêm mục vào ngăn xếp này.
         *
         * @param  item the item to add
         */
        public void push(Item item) {
            Node<Item> oldfirst = first;
            first = new Node<Item>();
            first.item = item;
            first.next = oldfirst;
            n++;
        }

        /**
         * Xóa và trả lại mục được thêm gần đây nhất vào ngăn xếp này.
         *
         * @return mục được thêm gần đây nhất
         * @throws NoSuchElementException if this stack is empty
         */
        public Item pop() {
            if (isEmpty()) throw new NoSuchElementException("Stack underflow");
            Item item = first.item;        // save item to return
            first = first.next;            // delete first node
            n--;
            return item;                   // return the saved item
        }


        /**
         * Returns  mục được thêm gần đây nhất vào ngăn xếp này.
         *
         * @return the item most recently added to this stack
         * @throws NoSuchElementException if this stack is empty
         */
        public Item peek() {
            if (isEmpty()) throw new NoSuchElementException("Stack underflow");
            return first.item;
        }

        /**
         * Returns một chuỗi biểu diễn của ngăn xếp này.
         *
         * @return chuỗi các mục trong ngăn xếp này theo thứ tự LIFO, cách nhau bằng dấu cách
         */
        public String toString() {
            StringBuilder s = new StringBuilder();
            for (Item item : this) {
                s.append(item);
                s.append(' ');
            }
            return s.toString();
        }


        /**
         * Returns một trình vòng lặp cho ngăn xếp này để lặp qua các mục theo thứ tự LIFO.
         *
         * @return một trình lặp cho ngăn xếp này lặp qua các mục theo thứ tự LIFO
         */
        public Iterator<Item> iterator() {
            return new LinkedIterator(first);
        }

        // the iterator
        private class LinkedIterator implements Iterator<Item> {
            private Node<Item> current;

            public LinkedIterator(Node<Item> first) {
                current = first;
            }

            // is there a next item?
            public boolean hasNext() {
                return current != null;
            }

            // returns the next item
            public Item next() {
                if (!hasNext()) throw new NoSuchElementException();
                Item item = current.item;
                current = current.next;
                return item;
            }
        }


        /**
         * Unit tests the {@code Stack} data type.
         *
         * @param args the command-line arguments
         */
        public void main(String[] args) {
            Stack<String> stack = new Stack<String>();
            stack.push("one");
            stack.push("two");
            stack.push("three");
        while (!stack.isEmpty()) System.out.println(stack.pop());

        }
    }
}