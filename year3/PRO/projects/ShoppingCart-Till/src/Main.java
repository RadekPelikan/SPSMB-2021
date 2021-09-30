import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static ArrayList<Item> items;

    public static void main(String[] args) {
        items = new ArrayList<Item>(
                Arrays.asList(
                        new Item("čokoláda", 30),
                        new Item("rohlík", 2),
                        new Item("brambůrky", 30),
                        new Item("Dobrá voda", 15),
                        new Item("Stůl", 3074.69),
                        new Item("Iphone", 9),
                        new Item("Sešit", 10.7),
                        new Item("Kalkulačka", 299.9),
                        new Item("Sklenička", 103.33333333)
                )
        );
        printItems();
        ArrayList<ArrayList<Integer>> orders = makeOrders();
        System.out.println(orders.toString());
    }

    public static ArrayList<ArrayList<Integer>> makeOrders() {
        ArrayList<ArrayList<Integer>> orders = new ArrayList<>();
        ArrayList<Integer> item_amount;

        while (true) {
            item_amount = orderItem();
            if (item_amount.get(0) == -1) {
                continue;
            } else if (item_amount.get(0) > -1) {
                break;
            }
            System.out.println(item_amount.toString());
            orders.add(item_amount);
        }
        return orders;
    }

    public static ArrayList<Integer> orderItem() {
        ArrayList<Integer> item_amount;
        try {
            item_amount = getNumbers();
            System.out.print("id, count: ");


            item_amount.set(0, item_amount.get(0) - 1);
            if (item_amount.get(0) < 0) {
                return item_amount;
            } //else if (item_amount.get(0) > items.size() - 1) {
//                throw new ArrayIndexOutOfBoundsException("\n\tNot enough items in shopping list");
//            }


            if (item_amount.get(1) < 1) {
                throw new Exception("\n\tYou cannot buy negative amount of things");
            }
        } catch (Exception err) {
            sc.nextLine();
            System.out.format("Invalid input:\t%s%n", err);
            return orderItem();
        }
        return item_amount;
    }

    public static ArrayList<Integer> getNumbers() {
        String numbers = prints();
        if (numbers.equals("")) {
            return new ArrayList<Integer>(Arrays.asList(0, 0));
        }
        String[] numbersString = numbers.replaceAll("[^-?0-9]+", " ").trim().split(" ");
        ArrayList<Integer> item_amount = new ArrayList<Integer>();
        item_amount.add(Integer.parseInt(numbersString[0]));
        item_amount.add(Integer.parseInt(numbersString[1]));
        System.out.println(item_amount.toString());
        return item_amount;
    }

    public static String prints() {
        String userChoose = sc.nextLine();
        if (userChoose.contains("help")) {
            printHelp();
            return "";
        } else if (userChoose.contains("list") || userChoose.contains("item")) {
            printItems();
            return "";
        } else if (userChoose.contains("exit")) {
            return "-1";
        }
        return userChoose;
    }

    public static void printItems() {
        for (int i = 0; i < items.size(); i++) {
            Item currentItem = items.get(i);
            System.out.format("%02d:\t%20s\t%6.2f%n", i + 1, currentItem.getName(), currentItem.getPrice());
        }
    }

    public static void printHelp() {
        System.out.println("END ORDERING: \t\t-1");
        System.out.println("Shopping list:\t\t 0");
    }
}
