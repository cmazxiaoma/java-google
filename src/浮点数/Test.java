package 浮点数;

import java.util.Objects;

public class Test {
    
    public static void main (String[] args) {
        double a = 1.345;
        double b = 1.34500;
        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a != b ");
        }
        
        System.out.println(Math.abs(b - a));
        System.out.println(Objects.equals(a, b));
    }
}
