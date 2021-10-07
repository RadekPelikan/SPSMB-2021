package _09m._06d_2;

public class AssignmentOperator {

    public static void main(String[] args) {
        int i = 5;
        int j;
        if (i == (j=5)) {
            System.out.println(j);
        }
    }
}
