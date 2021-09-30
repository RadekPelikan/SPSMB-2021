package _09m._30d_11;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysN {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Pole je referenční datový typ naozdíl od primitvních datových typů
        // Referenční datový typ si lze představit jako ukazatel do paměti.
        // Referenční datové typy vznikají dynamicky pomocí speciálního příkazy a zanikají,
        // jakmile na ně přestane existovat odkaz
        // Hodnota neplatného odkazu je hodnota konstanty
        int[] arr = new int[6];
        arr = null;

        // Deklarace pole
        // v Javě je zaručeno, že všechnyh nové prvnky majhí hodnotu 0, resp. false
        int[] arrInt = new int[10];
        // Deklarace s hodnotami
        int[] arrintTwo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Délka pole
        System.out.format("Length of array: %d%n", arrintTwo.length);

        // Přiřazení hodnoty do pole
        arrInt[0] = 43;
        System.out.print("Enter a number: ");
        arrInt[1] = sc.nextInt();
        System.out.println(Arrays.toString(arrInt));
    }
}
