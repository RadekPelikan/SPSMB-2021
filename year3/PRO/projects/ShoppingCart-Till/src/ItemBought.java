public class ItemBought extends Item {
    private final int count;

    public ItemBought(String name, int price, int count) {
        super(name, price);
        this.count = count;
    }

    public int getCount() { return count; }
}
