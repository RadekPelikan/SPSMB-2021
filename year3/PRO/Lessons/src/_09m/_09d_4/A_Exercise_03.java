package _09m._09d_4;

public class A_Exercise_03 {

    public static void main(String[] args) {
        double number1 = 5.1864848646;
        double number2 = 69 / 0f;
//        System.out.println(is_divisible(number1));
        if (is_number(number1) && is_number(number2))  {
            System.out.println("Zkrácené");
        }
        if (is_number(number1) & is_number(number2)) {
            System.out.println("Úplné");
        }
    }


    public static boolean is_number(double number) {
        if (number == Double.POSITIVE_INFINITY || number == Double.NEGATIVE_INFINITY || number == Double.NaN) {
            System.out.println(number);
//            throw new ArithmeticException("Small divider");
        }
        return true;
    }
}
