package _09m._23d_8;

import java.util.Scanner;

public class A_Exercise_03 {

    public static void main(String[] args) {
        // Napište program, který načte délku a šířku obledníku a podle těchto údajů obdelník vykreslí
        Scanner sc = new Scanner(System.in);
        System.out.print("Šířka: ");
        int width = sc.nextInt();
        System.out.print("Výška: ");
        int height = sc.nextInt();
        System.out.println();
        sc.nextLine();
        for (int i = 0; i < height; i++) {
//            System.out.print("*");
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print("-");
                    continue;
                } else if (j == 0 || j == width - 1) {
                    System.out.print("|");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
