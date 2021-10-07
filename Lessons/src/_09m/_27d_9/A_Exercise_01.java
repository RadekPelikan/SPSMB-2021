package _09m._27d_9;

public class A_Exercise_01 {

    public static void main(String[] args) {
        System.out.println(jePrvocislo(8));
        power(2, 10);
    }

    private static void power(final double x, final int n) {
        //Napište statickou metodu void power(double x, int n),
        // která vypíše tabulku mocnin x od 1 do n
        double tmp = x;
        for (int i = 1; i <= n; i++) {
            System.out.format("(%1.0f^%d):%4.0f ", x, i, tmp);
            tmp *= x;
        }
    }

    private static boolean jePrvocislo(int in) {
        //Napište statickou metodu boolean jePrvocislo(int i), která zjistí,
        // zda její parametr je prvočíslo (je dělitelné jen samo sebou a jedničkou)
        for (int i = in - 1; i > 1; i--) {
            if (in % i == 0) {
                return false;
            }
        }
        return true;
    }
}
