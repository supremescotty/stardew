package Players;

import ItemSystem.Entity;

public class Self extends Player {

    private int stamina;
    private int health;

    private Entity activeEntity; // the item active in one's inventory

    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina ) { this.stamina = stamina; }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health ) { this.health = health; }

    public void modifyStamina(int staminaToAddOrSubtract) { this.stamina += staminaToAddOrSubtract; }
    public void modifyHealth(int healthToAddOrSubtract) { this.health += healthToAddOrSubtract; }

    // empty constructor for TESTING ONLY
    public Self() {
        this("Dev", "");
    }

    // only one possible constructor
    public Self(String firstName, String lastName) {
        this.setNPC(false);
        this.setFirstName(firstName);
        this.setLastName(lastName);

        this.setInventory(new ItemSystem.Inventory(this));
    }
}