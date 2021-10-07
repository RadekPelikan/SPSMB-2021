package _09m._06d_2;

public class ArithmeticExpressions {

    public static void main(String[] args) {
        // unární (++, --, ~, 1)
        unary();
        // binární (+, -, *, /, /, %)
        binary();
        // ternární - používá se bool_výraz ? výraz1 : výraz2


    }

    public static void unary() {
        // prefixové (předpona): ++i;
        // postfixové (přípona): i++;
        int i = 1;
        System.out.println("i: " + i);
        System.out.println("operace: " + i++);
        System.out.println("i: " + i);
        System.out.println("operace: " + ++i);
        System.out.println("i: " + i);

        System.out.println("///////////////////////////////////////////////////");
        int a=5, b=1, c;
        a++;
        System.out.format("a:%d, b:%d %n", a, b);
        b=++a;
        System.out.format("a:%d, b:%d %n", a, b);
        b=a++;
        System.out.format("a:%d, b:%d %n", a, b);
        c=--b+2;
        System.out.format("a:%d, b:%d c:%d %n", a, b, c);

    }

    private static void binary() {
        // int / int - celočíselné dělení
        // int / float - reálné dělení
        // float / int - reálné dělení
        // float / float - reálné dělení

        int i = 5;
//        int r = 5/0; // Vyhodí error, nelze dělit nulou
    }


}
