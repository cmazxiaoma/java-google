package 用for循环实现链表反转;

import 链表创建.Node;

public class ReverseLinkedList {

    public Node create(int size) {
        Node head = null;
        Node pre = null;
        for (int i = 0; i < size; i++) {
            Node node = new Node(i);

            if (pre != null) {

                pre.setNext(node);

            } else {
                head = node;
            }

            pre = node;
        }

        return head;
    }

    public Node reverse(Node node) {

        Node newHead = null;
        Node currentHead = node;

        while (currentHead != null) {
            Node next = currentHead.getNext();
            currentHead.setNext(newHead);
            newHead = currentHead;
            currentHead = next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        ReverseLinkedList creator = new ReverseLinkedList();
        Node head = creator.create(10);
        System.out.println("head=" + head);
        Node.prinfLinkedList(head);

        Node newHead = creator.reverse(head);
        System.out.println("newHead=" + newHead);
        System.out.println("newHead.value=" + newHead.getValue() + ",newHead.next=" + newHead.getNext());

        Node.prinfLinkedList(newHead);
    }
}
