package _10m._04d_12;

import java.util.Arrays;
import java.util.Scanner;

public class A_Exercise_01 {

    public static void main(String[] args) {
        // Napište program, který přečte celé číslo typu int a vypíše jeho binární hodnotu
        Scanner sc = new Scanner(System.in);
        int nDec = sc.nextInt();
        sc.nextLine();
        System.out.println(Integer.toBinaryString(nDec));
        int maxPow = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (nDec < 1 << i) {
                maxPow = i;
                break;
            }
        }
        boolean[] nBinaryArr = new boolean[maxPow];
        Arrays.fill(nBinaryArr, false);
        for (int i = nBinaryArr.length; i >= 0; i--) {
            // Math.pow(2, i) == 1 << i
            if (nDec - (1 << i - 1) >= 0) {
                nDec -= 1 << i - 1;
                nBinaryArr[i - 1] = true;
            }
        }
        for (int i = nBinaryArr.length - 1; i >= 0; i--) {
            if(nBinaryArr[i]){
                System.out.print(1);
                continue;
            }
            System.out.print(0);
        }
    }
}