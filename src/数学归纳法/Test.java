package 数学归纳法;

public class Test {
    
    public static void main(String[] args) {
        Test t = new Test();
        long startTimeOne = System.currentTimeMillis();
        int a = t.sumOne(100);
        long endTimeOne = System.currentTimeMillis();
        System.out.println(a + "consume time =" + (endTimeOne - startTimeOne));
        long startTimeTwo = System.currentTimeMillis();
        int b = t.sumTwo(10000);
        long endTimeTwo = System.currentTimeMillis();
        System.out.println(b + "consume time=" + (endTimeTwo -startTimeTwo));
    }
    
    public int sumOne(int n) {
        if (n == 1) {
            return 1;
        }
        
        return n + sumOne(n - 1);
    }
    
    public int sumTwo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i ++) {
            sum += i;
        }
        return sum;
    }
}
