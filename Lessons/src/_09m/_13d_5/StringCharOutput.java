package _09m._13d_5;

public class StringCharOutput {

    public static void main(String[] args) {
        char ch = '\u263a';
        String s = "Gutten Tag";

        System.out.format("c: %c%n", ch);
        System.out.format("s: %s%n", s);
        System.out.format("S: %S%n", s);
        System.out.format("S: %20S%n", s);
    }
}
