package 自动装箱和自动拆箱;

public class Test {
    
    public static void main(String[] args) {
        Integer a = 2; // Boxing
        Integer b = new Integer(2); //Boxing
        int v = a.intValue();
        Integer c = 2;
        System.out.println(a == c);
        System.out.println(new Integer(2) == 2);
        System.out.println(new Integer(2) == new Integer(2));
        System.out.println(Integer.valueOf(2) == Integer.valueOf(2));
        System.out.println(Integer.valueOf(2).intValue() == 2);
        System.out.println(new Integer(2).equals(new Integer(2)));
    }

}
