package MyLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import 链表创建.Node;

public class MyLinkedList implements Iterable<Integer> {

    private Node head;
    private Node tail;

    public MyLinkedList() {
        super();
        this.head = null;
        this.tail = null;
    }

    public void add(int value) {
        Node node = new Node(value);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }

        tail = node;
    }

    @Override
    public Iterator<Integer> iterator() {
        // TODO Auto-generated method stub
        return new ListIterator();
    }

    class ListIterator implements Iterator<Integer> {
        private Node current;

        public ListIterator() {
            super();
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            if (current == null) {
                return false;
            }

            return true;
        }

        @Override
        public Integer next() {
            if (current == null) {
                throw new NoSuchElementException();
            }

            int value = current.getValue();
            current = current.getNext();
            return value;
        }
    }
}
