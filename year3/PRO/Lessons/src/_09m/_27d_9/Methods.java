package _09m._27d_9;

// Jirkovy zápisky
import java.util.Scanner;
//Scanner sc = new Scanner(System.in);
public class Methods {
    //Metody
    //psát takové, které provádějí jasně specifikovanou činnost
    //délka metody by neměla překročit 20 řádků (Herout)
    //krátké jméno metody, výstižné, tvořené dle jednoho schématu v celém programu
    //např. otevriSoubor(), otevriOkno()
    //doporučuje se do max 5 parametrů

    //metoda s parametry vracející typ int

    //Metoda bez parametru
    private static int secti(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt()+ sc.nextInt();
    }
    //metoda návratového typu
    private  static void tiskni(int a ){
        System.out.println(a);
    }
    //metoda s více parametry různých typů - doporučuje se max 5
    //přetížená metoda - metoda se stejným názvem, ale s jinými  parametry (počet, typ, pořadí)
    private static double secti(int a, double b){
        return a + b;
    }
    private static int secti2(int a, double b){
        return a +(int)b;
    }
    //rekurzivní metoda - lze  vždy obejít, není nutné používat
    private static long faktorial(long n){
        if (n<=1){
            return 1;
        }else {
            return faktorial(n-1)*n;
        }

    }
    //Fibonnaciho posloupnost
    private static int f(int n) {
        if (n <=1) return n;
        else return f(n-2)+f(n-1);
    }
    //předávání parametrů metodám (primitivní datové typy)
    //final v parametru znemožnuje změnu prměnné v těle metody
    private static int zmena(int i){
        int z = i;
        z++;
        return z;
    }
    private static void power (final double x, final int n){

    }
    //metoda s parametry vracející typ int
    public static void main(String[]args){
        //System.out.println(min(7,1));

        //System.out.println();

        // Math.tiskni(11);

        //System.out.println(Main.secti2(123, 1e9));
        // long n = 61;
        //System.out.format("%d! = %d%n",n,faktorial(n) );
        //for (int i = 0;i<10;i++){
        //System.out.println(f(i));

        int i = 1;
        System.out.println(i);
        System.out.println(zmena(i));
        System.out.println(i);
    }
}
