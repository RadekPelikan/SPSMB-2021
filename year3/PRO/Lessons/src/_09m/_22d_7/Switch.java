package _09m._22d_7;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine().charAt(0)) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("1");
                break;
            case 'd':
                System.out.format("2");
                break;
            default:
                System.out.format("3");
                break; // Zbytečný, ale píše se kvůli konvenci
        }
    }
}
