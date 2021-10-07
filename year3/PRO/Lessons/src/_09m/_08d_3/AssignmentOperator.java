package _09m._08d_3;

public class AssignmentOperator {


    public static void main(String[] args) {
        int i = 2;
        i = i + 2;
        i += 2;
        System.out.println(i);

        int j = 4;
        System.out.format("i: %d, j: %d, %n", i, j);
        i += j;
        System.out.format("i: %d, j: %d, %n", i, j);
        j *= 3.5;
        System.out.format("i: %d, j: %d, %n", i, j);
        j /= i;
        System.out.format("i: %d, j: %d, %n", i, j);
    }
}