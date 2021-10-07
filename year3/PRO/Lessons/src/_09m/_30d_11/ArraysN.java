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
        int[] arrIntTwo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Délka pole
        System.out.format("Length of array: %d%n", arrIntTwo.length);

        // Přiřazení hodnoty do pole
//        arrInt = arrAssignment(arrInt);

        // Seřazení pole
        Arrays.sort(arrInt);

        // Naplnění pole konstaní hodnotou
        int[] arrIntThree = new int[5];
        Arrays.fill(arrIntThree, 5);
        Arrays.fill(arrInt, 2, 4, 6);

        // Porovnání polí
        System.out.println(Arrays.equals(arrIntTwo, arrIntThree));

        // Nalezení prvku v seřazeném poli
        System.out.println(Arrays.binarySearch(arrInt, 5)); // Vrací zápornou hodnotu, pokud prvek nebyl nalezen

        // Dvourozměrné pole
        int[][] arrTwoD = new int[4][4];
//        printTwoDArr(arrTwoD);

        // Dvourozměrná pole s proměnnou délkou řádek
        int[][] arrTwoDlen = new int[5][];
//        printTwoDdiffLenArr(arrTwoDlen);

        // Inicializace dvouzměrného pole
        int[][] a = {{0, 1}, {1, 0}, {1, 1}};
        int[][] b = {{45, 6}, {3, 6, 8, 9}, {1}};

        // Více rozměrů v jednozměrném poli -
        // potřebujeme do spojitého úseku paměti přistupovat přes indexy řádků a slopců
        final int N_ROWS = 20;
        final int N_COLUMNS = 13;
        int[] screen = new int[N_ROWS * N_COLUMNS];
//        printArrAsTwoD(N_ROWS, N_COLUMNS, screen);
    }

    private static int[] arrAssignment(int[] arrInt) {
        arrInt[0] = 43;
        System.out.print("Enter a number: ");
        arrInt[1] = sc.nextInt();
        System.out.println(Arrays.toString(arrInt));
        // Pomocí pole
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arrInt));
        return arrInt;
    }

    private static void printTwoDArr(int[][] arrTwoD) {
        for (int i = 0; i < arrTwoD.length; i++) {
            for (int j = 0; j < arrTwoD[i].length; j++) {
                arrTwoD[i][j] = i * 10 + j;
                System.out.format("%2d ", arrTwoD[i][j]);
            }
            System.out.println();
        }
    }

    private static void printTwoDdiffLenArr(int[][] arrTwoDlen) {
        for (int i = 0; i < arrTwoDlen.length; i++) {
            arrTwoDlen[i] = new int[i + 1];
            for (int j = 0; j < arrTwoDlen.length; j++) {
                arrTwoDlen[i][j] = i * 10 + j;
                System.out.format("%2d ", arrTwoDlen[i][j]);
            }
            System.out.format("");
        }
    }

    private static void printArrAsTwoD (int N_ROWS, int N_COLUMNS, int[] screen) {
        for (int y = 0; y < N_ROWS; y++) {
            for (int x = 0; x < N_COLUMNS; x++) {
                screen[y * N_COLUMNS + x] = 100 * y + x;
                System.out.format("%4d ", screen[y * N_COLUMNS + x]);
            }
            System.out.println();
        }
    }
}
