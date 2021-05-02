package ItemSystem;

import ItemSystem.Entities.Tools.*;
import ItemSystem.Entities.Weapons.Sword;
import Players.Player;

public class Inventory implements Comparable<String> {
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
        else setUpStartingInventory(player);
    }

    /**
     * Create the starting inventory and add the starting tools / weapons to the player's inventory
     * @param player the human-controlled-player
     */
    private void setUpStartingInventory(Player player) {
        inventory = new InventorySlot[24];
        player.setInventory(this);
        ItemSystem.Inventory inventory = player.getInventory();

        ItemSystem.Entity[] starterItems = new ItemSystem.Entity[] {
                new Axe(), new Hoe(), new WateringCan(), new Sword(), new PickAxe(), new Scythe()
        };

        for (ItemSystem.Entity e : starterItems) {
            this.addToInventory(e);
        }
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

    /**
     * Remove an entity located at an index i
     * @param i the index in {{@link #inventory}}
     *
     * @see TrashCan
     */
    public void removeEntityFromPosition(int i) {
        this.inventory[i] = null;
    }

    public void sort() {
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            // loop through inventory
            for (int i = 0; i < this.inventory.length - 1; i++) {
                // not null checks
                if (this.inventory[i] != null && this.inventory[i].getEntity() != null && this.inventory[i + 1] != null && this.inventory[i + 1].getEntity() != null) {
                    // compareTo implementation
                    if (this.inventory[i].getEntity().getName().compareTo(this.inventory[i + 1].getEntity().getName()) > 0) {
                        // set tmp and do swap
                        Entity tmp = inventory[i].getEntity();
                        this.inventory[i].setEntity(inventory[i + 1].getEntity());
                        this.inventory[i + 1].setEntity(tmp);

                        swapped = true;
                    }
                }
            }
        }
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
