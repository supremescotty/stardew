package Players;

public class NPC extends Player {
    private boolean vendor; // do they sell stuff?
    private boolean marriable; // are they a bachelor or bachelorette?

    public NPC() {
        this(true, "", "");
    }

    public NPC(String firstName, String lastName) {
        this(true, firstName, lastName);
    }

    public NPC(boolean isNPC, String firstName, String lastName) {
        this(isNPC, firstName, lastName, false);
    }

    public NPC(boolean isNPC, String firstName, String lastName, boolean isVendor) {
        this.setNPC(isNPC);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setVendor(isVendor);

        this.setInventory(new ItemSystem.Inventory(this));
    }

    public boolean isVendor() { return vendor; }
    public void setVendor(boolean isVendor) { this.vendor = isVendor; }

    public boolean isMarriable() { return marriable; }
    public void setMarriable(boolean marriage) { this.marriable = marriage; }

    @Override
    public void setLocation(int i) {

    }
}
