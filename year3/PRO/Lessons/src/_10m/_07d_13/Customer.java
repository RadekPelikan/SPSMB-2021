package _10m._07d_13;

// Použití proměnné třídy (statické proměnné) v objektech
public class Customer {
    public static int nCustomers = 0;   // Proměnná třídy
    public int spent;

    public Customer() {
        Customer.nCustomers++;
        this.spent = 0;
    }

    public void buy(int price) {
        this.spent += price;
    }

    public static void main(String[] args) {
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);
        Customer a = new Customer();
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);
        Customer b = new Customer();
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);

        System.out.format("A utratil: %d%n", a.spent);
        a.buy(100);
        System.out.format("A utratil: %d%n", a.spent);
        b.buy(69);
        System.out.format("B utratil: %d%n", b.spent);
        System.out.format("utratili: %d%n", a.spent + b.spent);
    }
}
