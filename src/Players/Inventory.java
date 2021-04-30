package Players;

import ItemsOld.Item;

/**
 * Player or NPC Inventory
 *
 * @see ItemSlot
 */
public class Inventory {
    private ItemSlot[] inventory;
    private int totalSlots; // decide if i want to use this

    public ItemSlot[] getInventory() { return inventory; }
    public int getTotalSlots() { return totalSlots; }
    public void setTotalSlots(int totalSlots1) { this.totalSlots = totalSlots1; }

    public Inventory() {
        this(new NPC());
    }

    public Inventory(Player player) {
        if (player.isNPC()) {
            this.setTotalSlots(6);
        } else {
            this.setTotalSlots(24);
        }

        this.inventory = new ItemSlot[this.getTotalSlots()];
    }

    /**
     * Add a given Item to a corresponding inventory
     * @param item
     */
    public void addToInventory(Item item) {
        if (itemInInventory(item)) {
            addToStack(item, inventory);
        } else {
            // check if empty slot exists
            for (ItemSlot itemSlot : inventory) {
                if (itemSlot == null) {
                    // add item to empty slot
                    itemSlot = new ItemSlot(item);
//                    itemSlot.setItem(item);
                    System.out.println("set item");
                    break;
                }
            }
        }
    }

    /**
     * Add more items to existing stack of items in inventory
     * @param item the item(s) to add
     * @param inventory the inventory to add the item(s) to
     */
    private void addToStack(Item item, ItemSlot[] inventory) {
        for (ItemSlot itemSlot : inventory) {
            if (itemSlot.getItem().equals(item)) {
                // the following one-liner replaces the number of items in itemSlot with itself + the number of new items
                itemSlot.getItem().setNumberOfItems(itemSlot.getItem().getNumberOfItems() + item.getNumberOfItems());
                break;
            }
        }
    }

    /**
     * Check to see if an Item exists in the corresponding inventory
     * @param item the item in question
     * @return true if found in inventory; else false
     */
    private boolean itemInInventory(Item item) {
        for (ItemSlot itemSlot : inventory) {
            if (itemSlot != null && itemSlot.getItem().equals(item)) {
                return true;
            }
        }
        return false;
    }
}
