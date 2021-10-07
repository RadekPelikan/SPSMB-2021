package _09m._30d_11;

import java.util.Arrays;
import java.util.Scanner;

public class A_Exercise_01 {

    public static void main(String[] args) {
        //Napište program, který metodou Eratosthenova síta vypíše všecha prvočísla od 1 do N, kdy N zadáme z klávesnice
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] eSito = new boolean[n];//inicializace, všude je false
        Arrays.fill(eSito, 2, n, true);//inicializace síta, false nechám jen u prvků 0 a 1
//        System.out.println(Arrays.toString(eSito));
        for (int i = 0; i < eSito.length; i++) {
            if (eSito[i]) {//prvočíslo nalezeno
                System.out.format("%d ", i);
                for (int j = i * i; j < eSito.length; j += i) { //odstraníme jeho násobky v sítu (nastavíme na false)
                    eSito[j] = false;
                }
            }
        }
    }
}