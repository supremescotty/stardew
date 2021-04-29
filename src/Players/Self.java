package Players;

public class Self extends Player {

    private int stamina;
    private int health;
//    private int

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

    // only one possible constructor
    public Self(String firstName, String lastName) {
        this.setNPC(false);
        this.setFirstName(firstName);
        this.setLastName(lastName);

        this.setInventory(new Inventory(this));
    }
}
