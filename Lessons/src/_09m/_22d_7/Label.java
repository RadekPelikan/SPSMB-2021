package _09m._22d_7;

public class Label {

    public static void main(String[] args) {
//        jump: {
//            for (int i = 0; i < 10; i++) {
//                if (i==5) {
//                    break jump;
//                }
//                System.out.format("%d ", i);
//            }
//            System.out.println("\nmiddle");
//        }
//        System.out.println("\nend");



        outerLoop: {
            for (int i = 0; i < 10; i++) {
                System.out.format("i: %d\t", i);
                for (int j = 0; j < 10; j++) {
                    System.out.format("%d\t", j);
                    if (i == 4 && j == 6) {
                        break outerLoop;
                    }
                }
                System.out.println();
            }
            System.out.println("didnt break");
        }
        System.out.println("end");

    }

}
