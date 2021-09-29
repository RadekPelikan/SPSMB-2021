package _09m._15d_6;

import java.util.Scanner;

public class A_Exercise_05 {

    public static void main(String[] args) {
        // Napíšte program, který načte 3 celá čísla a vypíše jejich součet, součin, průměr, min, max číslo
        Scanner sc = new Scanner(System.in);
        int len = 10;
        int[] nArr = new int[len];
        int[] values = {0, 1, 0, Integer.MAX_VALUE, Integer.MIN_VALUE};
        int n;
        for (int i = 0; i < len; i++) {
            n = sc.nextInt();
            nArr[i] = n;
            values[0] += n;
            values[1] *= n;
            if (n < values[3]) {
                values[3] = n;
            } else if (n > values[4]) {
                values[4] = n;
            }
        }
        values[2] = values[0] / len;
        for (int number:values) {
            System.out.println(number);

        }
    }
}
