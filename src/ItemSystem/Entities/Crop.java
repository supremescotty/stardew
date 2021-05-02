package ItemSystem.Entities;

import ItemSystem.Entity;
import ItemSystem.EntityType;

public abstract class Crop extends Entity {
    private int state; // state of growth
    private int maxState; // the state of a fully grown crop
    private int growthTime; // time for crop to grow to maxState (days)
    private int healthRegen;
    private int staminaRegen;
    private boolean handPicked;

    // ===========================

    public Crop(String name, String description, float sellPrice, float buyPrice, int healthRegen, int staminaRegen) {
        super(name, description, sellPrice, buyPrice, EntityType.CROP, 1);
    }

    public void harvest() {
        if (state == maxState && !this.isHandPicked()) {
            // todo add code to disallow harvesting non-handpicked crops without a scythe

            return;
        }
    }

    public void harvest(Tool tool) {
        if (state == maxState && this.isHandPicked()) {
            // todo add code to disallow harvesting handpicked crops with a tool

            return;
        }
    }

    // ===========================

    public int getHealthRegen() { return healthRegen; }
    public void setHealthRegen(int healthRegen) { this.healthRegen = healthRegen; }

    public int getStaminaRegen() { return staminaRegen; }
    public void setStaminaRegen(int staminaRegen) { this.staminaRegen = staminaRegen; }

    public int getState() { return state; }
    public void setState(int state) { this.state = state; }

    public int getMaxState() { return maxState; }
    public void setMaxState(int maxState) { this.maxState = maxState; }

    public boolean isHandPicked() { return handPicked; }
    public void setHandPicked(boolean handPicked) { this.handPicked = handPicked; }

    public int getGrowthTime() { return growthTime; }
    public void setGrowthTime(int growthTime) { this.growthTime = growthTime; }
}
