package _09m._22d_7;

public class Condition {

    public static void main(String[] args) {
        char c='e';
        //if(!(c=='a' || c=='b' || c=='c')){ //nevhodné (negace)
        /*
        if(c!='a' && c!='b' && c!='c') { //OK (aserce)
            System.out.println("c neni a, b, ani c");
        } else {
            System.out.println("c je bud a, b, nebo c");
        }*/
        if(c!='a' && c!='b' && c!='c')
            System.out.println("c neni a, b, ani c");
        else
            System.out.println("c je bud a, b, nebo c");
    }

}
