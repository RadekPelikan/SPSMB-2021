package _09m._13d_5;

public class BitwiseLogical {

    public static void main(String[] args) {
        // &    Bitwise (Úplné)
        // &&   Logical (Zkrácené)
        int y = 0, x = 1, z = 5;
        boolean bo = true;
        if (y != 0 & (bo=(x > z))) {
            System.out.println("OK");
        }
        System.out.println(bo);
        if (y != 0 && (bo=(x > z))) {
            System.out.println("OK");
        }
        System.out.println(bo);
    }
}
