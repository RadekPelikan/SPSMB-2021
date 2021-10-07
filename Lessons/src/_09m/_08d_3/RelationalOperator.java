package _09m._08d_3;

public class RelationalOperator {

    public static void main(String[] args) {
        // Nezbytné pro konstrukce řízení programu
        // == != && || & | ! < > <= >=
        // !true = false
        // && || Zkrácené vyhodnocení   (nejpravděpodobnější false)
        // & | Úplné vyhodnocení        (nejpravděpodobnější true)

        int y = 0, x = 1, z = 5;
        if (y != 0 & x / y < z) {
            System.out.println("OK");
        }
        if (y != 0 && x / y < z) {
            System.out.println("OK");
        }

        // Git příkazy
        ///////////////////////////
        // git init
        // git add "adresar"
        // git status
        // git commit -m"komentar"
        // git log
        // git diff
        // git log --name-only
    }
}
