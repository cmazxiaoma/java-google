package TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Student garrett = new Student("garrett", 174, 140);
        Student xiaoma = new Student("xiaoma", 155, 80);
        TreeMap<MyKey, Student> treeMaps = new TreeMap<MyKey, Student>();
        treeMaps.put(new MyKey(garrett.getHeight()), garrett);
        treeMaps.put(new MyKey(xiaoma.getHeight()), xiaoma);

        Iterator<Entry<MyKey, Student>> iter = treeMaps.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<MyKey, Student> entry = iter.next();
            System.out.println(entry.getValue());
        }
    }
}
