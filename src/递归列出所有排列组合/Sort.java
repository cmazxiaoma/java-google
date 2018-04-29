package 递归列出所有排列组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
    
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.sort(new ArrayList<Integer>(), new ArrayList<Integer>(), 0);
        System.out.println("=================================");
        sort.sort(new ArrayList<Integer>(), new ArrayList<Integer>(), 5);
        System.out.println("=================================");
        sort.sort(new ArrayList<Integer>(), Arrays.asList(1), 0);
        System.out.println("=================================");
        sort.sort(new ArrayList<Integer>(), Arrays.asList(1), 2);
        System.out.println("=================================");
        sort.sort(new ArrayList<Integer>(), Arrays.asList(1, 2, 3, 4, 5), 0);
        System.out.println("=================================");
        sort.sort(new ArrayList<Integer>(), Arrays.asList(10, 20, 30, 40), 3);
    }
    
    /**
     * Generates all combinations and output them
     * selecting n elements from data
     * @param selected
     * @param data
     * @param n
     */
    public void sort(List<Integer> selected, List<Integer> data, int n) {
        if (n == 0) {
            if (!selected.isEmpty()) {
                for (Integer integer : selected) {
                    System.out.print(integer + " ");
                }
                System.out.println("");
            }
            return;
        }
        
        if (data.isEmpty()) {
            return;
        }
        
        //select element 0
        selected.add(data.get(0));
        sort(selected, data.subList(1, data.size()), n - 1);
        
        //unselect element 0
        selected.remove(selected.size() - 1);
        sort(selected, data.subList(1, data.size()), n);
    }
}
