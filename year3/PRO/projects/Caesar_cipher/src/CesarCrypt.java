import java.util.Scanner;

public class CesarCrypt {
    private String textDecrypted = "", textEncrypted = "";
    private int key = 1;

    public void encryptUser() {
        this.setConsoleDecrypted();
        this.setConsoleKey();
        this.createEncrypted();
        System.out.format("%-17s%s%n", "Encrypted text:", this.textEncrypted);
    }

    public void decryptUser() {
        this.setConsoleEncrypted();
        this.setConsoleKey();
        this.createDecrypted();
        System.out.format("%-17s%s%n", "Decrypted text:", this.textDecrypted);
    }

    // MAIN METHOD FOR CRYPTING ///////////////////////////
    private String caesar(String text, boolean encrypting) {
        char[] arrText = text.toCharArray();
        String cryptedText = "";
        int chNumber;
        for (char ch : arrText) {
            chNumber = (int) Character.toUpperCase(ch) - 64;
            chNumber += encrypting ? this.key : -this.key;
            chNumber %= 26;
            chNumber = chNumber < 1 ? chNumber + 26 : chNumber;
            cryptedText += (char) (Character.isUpperCase(ch) ? chNumber + 64 : chNumber + 96);
        }
        return cryptedText;
    }
    // MAIN METHOD FOR CRYPTING ///////////////////////////

    // GENERATORS /////////////////////////////////////////
    public void createEncrypted() {
        this.textEncrypted = this.caesar(this.textDecrypted, true);
    }

    public void createDecrypted() {
        this.textDecrypted = this.caesar(this.textDecrypted, false);
    }
    // GENERATORS /////////////////////////////////////////

    // SETTERS ////////////////////////////////////////////
    public void setTextDecrypted(String textToSet) {
        if (isAlphabetic(textToSet)) {
            this.textDecrypted = textToSet;
            this.createEncrypted();
            return;
        }
        this.printInvalid();
        this.setConsoleDecrypted();
    }

    public void setTextEncrypted(String textToSet) {
        if (isAlphabetic(textToSet)) {
            this.textEncrypted = textToSet;
            this.createDecrypted();
        }
        this.printInvalid();
        this.setConsoleEncrypted();
    }

    public void setKey(String keyToSet) {
        if (keyToSet.equals("" + this.key) || keyToSet.equals("")) return;
        else if (keyToSet.matches("-?\\d+(\\d+)?")) {
            this.key = Integer.parseInt(keyToSet);
            return;
        } else if (Character.isAlphabetic(keyToSet.charAt(0))) {
            this.key = keyToSet.charAt(0);
            this.key = Character.toUpperCase(this.key) - 64;
            return;
        }
        this.printInvalid();
        this.setConsoleKey();

    }
    // SETTERS ////////////////////////////////////////////

    // GETTERS ////////////////////////////////////////////
    public String getTextDecrypted() {
        return this.textDecrypted;
    }

    public String getEncrypted() {
        return this.textEncrypted;
    }

    public int getKey() {
        return this.key;
    }
    // GETTERS ////////////////////////////////////////////

    // CONSOLES ///////////////////////////////////////////
    public void setConsoleDecrypted() {
        System.out.format("%-17s", "Text to encrypt: ");
        this.setTextDecrypted(consoleInput());
    }

    public void setConsoleEncrypted() {
        System.out.format("%-17s", "Text to decrypt: ");
        this.setTextEncrypted(consoleInput());
    }

    public void setConsoleKey() {
        System.out.format("%-17s", String.format("Key(%d):", this.key));
        this.setKey(consoleInput());
    }
    // CONSOLES ///////////////////////////////////////////

    // MISC ///////////////////////////////////////////////
    private boolean isAlphabetic(String text) {
        return (text != null)
                && (!text.equals(""))
                && (text.matches("^[a-zA-Z]*$"));
    }

    private String consoleInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private void printInvalid() {
        System.out.println("Invalid input");
    }
    // MISC ///////////////////////////////////////////////
}