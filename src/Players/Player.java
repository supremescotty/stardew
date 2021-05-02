package Players;

//import Players.Inventory;

import ItemSystem.Inventory;

public abstract class Player {
    private boolean isNPC;
    private String firstName;
    private String lastName;

    private ItemSystem.Inventory inventory;

    public boolean isNPC() { return isNPC; }
    public void setNPC(boolean NPC) { isNPC = NPC; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getName() { return firstName + " " + lastName; }

    public ItemSystem.Inventory getInventory() { return inventory; }
    public void setInventory(ItemSystem.Inventory inventory) { this.inventory = inventory; }
}