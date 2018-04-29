package 树的遍历;

public class Test {
    
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.sum(10));
    }
    
    public int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}
