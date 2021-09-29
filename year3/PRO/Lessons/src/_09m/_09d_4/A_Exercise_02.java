package _09m._09d_4;

public class A_Exercise_02 {

    public static void main(String[] args) {
        double n = Double.MAX_VALUE / Double.MIN_VALUE; // Double.MAX_VALUE / 0f;
//        double k = 0 / 0;
        is_divisible(n);
        double real = 3.14;
        int whole = (int) real;
        System.out.println(whole);
    }

    public static void is_divisible(double number) {
        if (number == Double.POSITIVE_INFINITY || number == Double.NEGATIVE_INFINITY || number == Double.NaN) {
            throw new ArithmeticException("Small divider");
        }
    }
}
