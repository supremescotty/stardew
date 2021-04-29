package ItemsOld;

/**
 * General item class
 */
public abstract class Item {
//    private Hashtable<Integer, Item> ItemDictionary = new Hashtable<Integer, Tool>();

    private int healthBuff;
    private int staminaBuff;
    private int buyPrice;
    private int sellPrice;
    private int numberOfItems;
    private String description;
    private boolean stackable;

    public int getHealthBuff() { return healthBuff; }
    public void setHealthBuff(int healthBuff1) { healthBuff = healthBuff1; }

    public int getStaminaBuff() { return staminaBuff; }
    public void setStaminaBuff(int staminaBuff1) { staminaBuff = staminaBuff1; }

    public int getBuyPrice() { return buyPrice; }
    public void setBuyPrice(int buyPrice1) { buyPrice = buyPrice1; }

    public int getSellPrice() { return sellPrice; }
    public void setSellPrice(int sellPrice1) { sellPrice = sellPrice1; }

    public String getDescription() { return description; }
    public void setDescription(String description1) { description = description1; }

    public int getNumberOfItems() { return numberOfItems; }
    public void setNumberOfItems(int numberOfItems1) { numberOfItems = numberOfItems1; }

    public boolean isStackable() { return stackable; }
    public void setStackable(boolean stackable1) { stackable = stackable1; }
}
