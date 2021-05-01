package ItemSystem;

import Players.Player;

public class Inventory {
    private InventorySlot[] inventory;

    public InventorySlot[] getInventory() { return inventory; }

    /**
     * Create a new inventory for a player object;
     * <li>NPC has 6 slots available</li>
     * <li>Self (the player) has 24 slots available</li>
     *
     * @param player the player with the corresponding inventory
     *
     * @see Player
     * @see Players.NPC
     * @see Players.Self
     */
    public Inventory(Player player) {
        if (player.isNPC()) inventory = new InventorySlot[6];
        else inventory = new InventorySlot[24];
    }

    public void addToInventory(Entity e) {
        if (entityInInventory(e)) {
            addToStack(e);
        } else {
            for (InventorySlot slot : getInventory()) {
                if (slot == null) {
                    // add entity to empty slot and break
                    slot = new InventorySlot(e);
                    break;
                }
            }
        }
    }

    private boolean entityInInventory(Entity e) {
        for (InventorySlot slot : inventory) {
            if (slot != null && slot.getEntity().equals(e)) return true;
        }
        return false;
    }

    private void addToStack(Entity e) {
        for (InventorySlot slot : inventory) {
            if (slot.getEntity().equals(e)) {
                // increase number of entities of the entity inside slot by:
                // the current number of entities + the number to add (e.getNumberOfEntities())
                slot.getEntity().setNumberOfEntities(slot.getEntity().getNumberOfEntities() + e.getNumberOfEntities());
            }
        }
    }
}
