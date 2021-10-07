package _09m._09d_4;

public class BitOperations {

    public static void main(String[] args) {
        // & | ~ ^ << >> >>>


        // stavove slovo
        final byte VIDITELNY = 1, PREMISTITELNY = 2, MENITELNY = 4, SMAZATELNY = 8;
        byte stav = 0;
        stav |= VIDITELNY;
        stav |= PREMISTITELNY;
        System.out.println(stav);

        if ((stav & VIDITELNY) == VIDITELNY) {
            System.out.println("Je VIDITELNY");
        }

        stav &=~VIDITELNY;
        System.out.println(stav);

        if ((stav & VIDITELNY) == VIDITELNY) {
            System.out.println("Je VIDITELNY");
        }
    }
}
