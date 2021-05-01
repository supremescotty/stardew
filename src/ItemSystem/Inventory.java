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

    /**
     * Add an Entity object to the inventory
     * @param e the Entity to add
     */
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

    /**
     * Check to see if an Entity is in the inventory
     * @param e the Entity in question
     * @return true if found; else false;
     */
    private boolean entityInInventory(Entity e) {
        for (InventorySlot slot : inventory) {
            if (slot != null && slot.getEntity().equals(e)) return true;
        }
        return false;
    }

    /**
     * If there exists an entity already in the inventory, add to the number of entities
     * @param e the entity to add,
     *          use {@link ItemSystem.Entity.getNumberOfEntities()}
     *          to get the number of entities to add
     */
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
