package Players;

public class NPC extends Player {
    /**
     * Create a new NPC
     */
    public NPC() {
        this(true, "", "");
    }

    public NPC(boolean isNPC, String firstName, String lastName) {
        this.setNPC(isNPC);
        this.setFirstName(firstName);
        this.setLastName(lastName);

        this.setInventory(new Inventory(this));
    }

}
