package _09m._23d_8;

import java.util.Scanner;

public class A_Exercise_04 {

    public static void main(String[] args) {
        // Napište program, který čte celá čísla tak dlouho, dokud nezadáte nulu. Z přečtených čísel vypište to s největší hodnotu, použijte while
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = n;
        while (true) {
            if (n == 0) break;
            n = sc.nextInt();
            max = n > max ? n : max;
        }
        System.out.println(max);
    }
}
