package _09m._13d_5;

public class RealFormattedOutput {

    public static void main(String[] args) {
        double d = 185318531.81483418831863;
        float f = 1.86483f;

        java.util.Locale.setDefault(new java.util.Locale("en", "US"));
        System.out.format("d: %f%n", d);                // %f běžná R
        System.out.format("d: %g, f: %g%n", d, f);      // %g je pro vědeckou notaci, když uzná za vhodné
        System.out.format("d: %e, f: %e%n", d, f);      // %e vědecká notace (vždy)
        System.out.format("d: %20.10e, f: %e%n", d, f);


    }
}
