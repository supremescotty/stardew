package Items;

/**
 * General item class
 */
public class Item {
    private int healthBuff;
    private int staminaBuff;
    private int buyPrice;
    private int sellPrice;
    private int numberOfItems;

    public int getHealthBuff() { return healthBuff; }
    public void setHealthBuff(int healthBuff) { this.healthBuff = healthBuff; }

    public int getStaminaBuff() { return staminaBuff; }
    public void setStaminaBuff(int staminaBuff) { this.staminaBuff = staminaBuff; }

    public int getBuyPrice() { return buyPrice; }
    public void setBuyPrice(int buyPrice) { this.buyPrice = buyPrice; }

    public int getSellPrice() { return sellPrice; }
    public void setSellPrice(int sellPrice) { this.sellPrice = sellPrice; }

//    private void increaseNumberOfItems(int numberToAdd) {
//        numberOfItems += numberToAdd;
//    }

    public int getNumberOfItems() { return numberOfItems; }
    public void setNumberOfItems(int numberOfItems) { this.numberOfItems = numberOfItems; }
}
