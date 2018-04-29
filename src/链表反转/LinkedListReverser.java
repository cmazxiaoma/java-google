package 链表反转;

import java.util.ArrayList;
import java.util.Arrays;

import 链表创建.LinkedListCreator;
import 链表创建.Node;

public class LinkedListReverser {
    
    /**
     * Reverses a linked list
     * @param head the linked list that need to reverse
     * @return head of the reversed linked list
     */
    public Node reverseLinkedList(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        
        Node newHead = reverseLinkedList (head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        System.out.println(newHead.toString());
        return newHead;
    }
    
    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        LinkedListReverser reverser = new LinkedListReverser();
        Node.prinfLinkedList(reverser.reverseLinkedList(creator.createdLinkedList(new ArrayList<Integer>())));
        Node.prinfLinkedList(reverser.reverseLinkedList(creator.createdLinkedList(Arrays.asList(1))));
        Node.prinfLinkedList(reverser.reverseLinkedList(creator.createdLinkedList(Arrays.asList(1, 2, 3, 4, 5))));
    }
}
