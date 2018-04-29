package 链表创建;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListCreator {
    private int count;
    /**
     * Creates a linked list
     * @param data the data to create the list
     * @return head of the linked list.The returned linked list
     * ends with last node with getNext() == null
     */
    public Node createdLinkedList(List<Integer> data) {
        count ++;
        if (data.isEmpty()) {
            return null;
        }
        
        Node firstNode = new Node(data.get(0));
        Node headOfSublist = createdLinkedList(data.subList(1, data.size()));
        firstNode.setNext(headOfSublist);
        System.out.println(firstNode.toString());
        return firstNode;
    }
    
    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        Node.prinfLinkedList(creator.createdLinkedList(new ArrayList<Integer>()));
        Node.prinfLinkedList(creator.createdLinkedList(Arrays.asList(1)));
        Node.prinfLinkedList(creator.createdLinkedList(Arrays.asList(1, 2, 3, 4, 5)));
    }
}
