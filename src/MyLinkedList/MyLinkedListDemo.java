package MyLinkedList;

import java.util.Iterator;

public class MyLinkedListDemo {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
