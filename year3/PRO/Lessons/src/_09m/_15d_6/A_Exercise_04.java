package _09m._15d_6;

import java.util.Scanner;

public class A_Exercise_04 {

    public static void main(String[] args) {
        // Napište program, který přečte tři malá písmena a výpíše je jako tři velká písmena.
        // (Od hodnoty malého písmene odečtete 32 a dostanete velkké písmeno - přetypuje)
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] sArr = s.toCharArray();
        int chValue;
        char newCh;
        for (char ch: sArr) {
            chValue = (int) ch;
            newCh = (char) (chValue - 32);
            System.out.print(newCh);
        }
//        System.out.format("%S", s);
    }
}
