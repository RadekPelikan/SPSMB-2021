import java.util.List;

public class Bill {
    private List<ItemBought> billItems;

    public void addItem() {

    }

    public List<ItemBought> getBillItems() {
        return billItems;
    }

    public void setBillItems(List<ItemBought> billItems) {
        this.billItems = billItems;
    }
}
