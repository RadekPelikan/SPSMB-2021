package _09m._29d_10;

public class A_Exercise_01 {

    public static void main(String[] args){
        System.out.println(power(2, 6));
    }

    private static double power (final double x, final int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n -1);
    }

}
