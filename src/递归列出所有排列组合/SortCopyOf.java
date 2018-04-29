package 递归列出所有排列组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortCopyOf {
    
    public static void main(String[] args) {
        SortCopyOf sort = new SortCopyOf();
        sort.Combination(new ArrayList<Integer>(), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 2);
    }
    
    public void Combination(List<Integer> selected, List<Integer> data, int n) {
        if (n == 0) {
            for (Integer integer: selected){
                System.out.print(integer + " ");
            }
            System.out.println(" ");
            return;
        }
        
        if (data.isEmpty()){
            return;
        }
        
        //selected element 0
        selected.add(data.get(0));
        Combination(selected, data.subList(1, data.size()), n - 1);
        
        //unselected element 0
        selected.remove(selected.size() - 1);
        Combination(selected, data.subList(1, data.size()), n);
    }
}
