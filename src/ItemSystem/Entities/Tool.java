package ItemSystem.Entities;

import ItemSystem.Entity;
import ItemSystem.EntityType;

public abstract class Tool extends Entity {
    private int mainMinStat; // used only for WateringCan
    private int mainMaxStat; // e.g., max water level (can), max hits to take down tree (axe), etc.

    public Tool(String name, String description, float sellPrice, float buyPrice) {
        super(name, description, sellPrice, buyPrice, EntityType.TOOL);

        this.setStackable(false);
    }

    /**
     * The abstract declaration for the main purpose of all tools!
     *      Each individual tool will have it's own implementation.
     *      For example: an Axe will chop trees and a PickAxe will mine!
     */
    public abstract void execute();

    /**
     * Increase the mainMaxStat (used for watering can)
     * @param increment
     */
    public void increaseMainMaxStat(int increment) {
        setMainMaxStat(getMainMaxStat() + increment);
    }

    /**
     * Decrease the mainMaxStat (used for Axes, Pick-Axes, etc.)
     * @param decrement
     */
    public void decreaseMainMaxStat(int decrement) {
        setMainMaxStat(getMainMaxStat() - decrement);
    }

    public int getMainMaxStat() { return mainMaxStat; }
    public void setMainMaxStat(int mainMaxStat) { this.mainMaxStat = mainMaxStat; }
}
