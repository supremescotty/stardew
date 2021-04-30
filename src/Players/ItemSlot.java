package Players;

import ItemsOld.Item;

public class ItemSlot {
    private ItemsOld.Item item;

    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }

    public ItemSlot(ItemsOld.Item item) {
        this.item = item;
    }

    public boolean isNull() {
        if (item == null) {
            return true;
        }
        return false;
    }
}
