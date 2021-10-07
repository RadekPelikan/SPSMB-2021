package _09m._06d_2;

public class TypeCastOperator {

    public static void main(String[] args) {
        // má nejvyšší prioritu //
        // rozšižující konverze (implicitní), nedochází ke ztrátě informace
        // byte -> short (char) -> int -> long -> float -> double

        byte b = 5;
        short s;

        s = b;

        System.out.println(s);

        // zužující konverze (explicitní), může dojít ke ztrátě informace
        // double -> float -> long -> int -> short (char) -> byte
        byte bb;
        short ss = 128;

        bb = (byte) ss;

        System.out.println(bb);

    }
}
