package _09m._23d_8;

public class A_Exercise_05 {

    public static void main(String[] args) {
        // Vypočtěte e (základ přirozených logaritmů) podle vzorce
        float euler = 1;
        int factorial = 1;
        int i = 1;
        float part;
        do {
            factorial *= i++;
            part = 1f / factorial;
            euler += part;
        } while (part > 10e-7);
        System.out.println(euler);
    }
}
