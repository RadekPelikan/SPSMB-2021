package _10m._04d_12;

import java.util.Scanner;

public class A_Exercise_02 {

    public static void main(String[] args) {
        // Napište program, který přečte celé číslo typu long složené jen z nul
        // a jedniček, které bude chápáno jako číslo. Vypište dekacdicky hodnotu tohoto čísla
        Scanner sc = new Scanner(System.in);
        char[] nBinaryArr = sc.nextLine().toCharArray();
        int nDec = 0;
        for (int i = 0; i < nBinaryArr.length; i++) {
            if (nBinaryArr[i] == '1') {
                nDec += 1 << nBinaryArr.length - 1 - i;
            }
        }
        System.out.println(nDec);
    }
}