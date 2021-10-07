package _09m._06d_2;

public class CharStuff {

    public static void main(String[] args) {
        char ch0 = 0;
        char ch1 = 'A';
        char ch2 = '\u263A';
        char ch3 = '\u00E1';
        char ch4 = '\u0007';
        char[] chArr = {ch0, ch1, ch2, ch3, ch4};

        for (char character:chArr) {
            System.out.println(character);
        }

    }
}
