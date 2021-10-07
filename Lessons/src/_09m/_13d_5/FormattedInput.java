package _09m._13d_5;

import java.util.Scanner;

public class FormattedInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double d = 0;
        char ch = '\0';
        System.out.print("Zadej string: ");
        String s = sc.next();
//        System.out.println(s);

        sc.nextLine();
        System.out.print("Zadej znak: ");
        char ch0 = sc.nextLine().charAt(0);
//        System.out.println(ch0);
        System.out.print("Zadej celé číslo: ");
        i = sc.nextInt(); sc.nextLine();
        System.out.format("%s\t%c\t%d", s, ch0, i);
    }
}
