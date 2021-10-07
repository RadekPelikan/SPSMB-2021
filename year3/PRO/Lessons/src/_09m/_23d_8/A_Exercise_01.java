package _09m._23d_8;

import java.util.Scanner;

public class A_Exercise_01 {

    public static void main(String[] args) {
        // Napište program, který přečte 2 celá čísla a pomocí ternárního operátoru pritne menší a větši číslo
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.format("a: %d%nb: %d%n", a, b);
        boolean smallerIsA = a < b;
        System.out.format("Smaller digit: %d\tBigger digit: %d", smallerIsA ? a : b, smallerIsA ? b : a);
    }
}
