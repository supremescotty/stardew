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
        if (player.isNPC()) inventory = new InventorySlot[4];
        else inventory = new InventorySlot[24];
    }

    /**
     * Add an Entity object to the inventory
     * @param e the Entity to add
     */
    public void addToInventory(Entity e) {
        if (e.isStackable() && entityInInventory(e)) {
            addToStack(e);
        }
        else if (inventoryFull()) {
            return;
        }
        else {
            addNewEntity(e);
        }
    }

    private void addNewEntity(Entity e) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = new InventorySlot(e);
                break;
            }
        }
    }

    private boolean inventoryFull() {
        for (InventorySlot slot : inventory) {
            if (slot == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check to see if an Entity is in the inventory
     * @param e the Entity in question
     * @return true if found; else false;
     */
    private boolean entityInInventory(Entity e) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].getEntity().getName() == e.getName()) {
                return true;
            }
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
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].getEntity().getName() == e.getName()) {
                inventory[i].getEntity().setNumberOfEntities(inventory[i].getEntity().getNumberOfEntities() + e.getNumberOfEntities());
            }
        }
    }

    public void removeEntityFromPosition(int i) {
        this.inventory[i] = null;
    }
}
