package _09m._23d_8;

import java.util.Scanner;

public class A_Exercise_02 {

    public static void main(String[] args) {
        // Napište program, který přečte dva znaky v rozhasu 0-9 a A-F
        // Tyto znaky pak považujte za jedno hexadecimální číslo a jeho hodnotu vypičte dekaicky (desítkově)
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] hexText = text.toCharArray();
        int chNumber;
        int hexNumber = 0;
        char ch;
        for (int i = 0; i < hexText.length; i++) {
            ch = hexText[i];
            if (!Character.isDigit(ch) && !(ch >= 'A' && ch <= 'F')) {
                System.out.println("Invalid Input");
                break;
            }
            chNumber = (int) ch;
            chNumber -= Character.isDigit(ch) ? 48 : 55;
            hexNumber += chNumber * Math.pow(16, hexText.length - i - 1);
        }
        System.out.println(hexNumber);
        System.out.println(Integer.parseInt(text, 16));
    }
}
