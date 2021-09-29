package _09m._13d_5;

public class FormattedOutput {

    public static void main(String[] args) {
        // verze 1.6+   java.io.Console
        // System.out.print()
        // System.out.printf()
        // System.out.format()
        // String.format()

        int i = 154861, j = 17;
        char c = '\n';

        System.out.println("Bruh");
        System.out.println("number i: " + i);
        System.out.format("number i: %d%n", i);
        System.out.println(c + i);
        System.out.println(i + c);

        System.out.println("//////////////////////////////////////////");
        System.out.format("OK%nOK%n");

        System.out.format("i: |%7d|%n", i); // Klasický zarovnání v pravo
        System.out.format("i: |%-7d|%n", i);// Zarovnání v levo
        System.out.format("i: |%+7d|%n", i);// Zarovnání v pravo s pluskem
        System.out.format("i: |%07d|%n", i);// Zarovnání v pravo s doplňujícími nulami
        System.out.format("i: |%,9d|%n", i);// Zarovnání v pravo s odělenými tisíci mezerou
        System.out.format("i: |%7d| j : %7d%n", i, j);
        System.out.format("i: |%1$7d| j : %1$7d%n", i); // Indexování parametru (`n`$)

        System.out.format("i: %o, j: 0%o%n", i, j); // Vypsání v oktálové soustavě
        System.out.format("i: %x, j: 0x%x%n", i, j);// Vypsání v hexadecimální soustavě
        System.out.format("i: %b%n", i);// true, false
        System.out.format("i: %B%n", i);// TRUE, FALSE

        System.out.format("i: %8s%n", Integer.toBinaryString(i));// Vypsání v binární soustavě

    }
}
