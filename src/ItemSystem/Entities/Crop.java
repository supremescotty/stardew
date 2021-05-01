package ItemSystem.Entities;

import ItemSystem.Entity;
import ItemSystem.EntityType;

public abstract class Crop extends Entity {
    private int state; // state of growth
    private int maxState; // the state of a fully grown crop
    private int healthRegeneration;
    private int staminaRegeneration;
    private boolean handPicked;

    // ===========================

    public Crop(String name, String description, float sellPrice, float buyPrice, int healthRegeneration, int staminaRegeneration) {
        super(name, description, sellPrice, buyPrice, EntityType.CROP, 1);
    }

    public void harvest() {
        if (!this.isHandPicked()) {
            // todo add code to disallow harvesting non-handpicked crops without a scythe

            return;
        }
    }

    public void harvest(Tool tool) {
        if (this.isHandPicked()) {
            // todo add code to disallow harvesting handpicked crops with a tool

            return;
        }
    }

    // ===========================

    public int getHealthRegeneration() { return healthRegeneration; }
    public void setHealthRegeneration(int healthRegeneration) { this.healthRegeneration = healthRegeneration; }

    public int getStaminaRegeneration() { return staminaRegeneration; }
    public void setStaminaRegeneration(int staminaRegeneration) { this.staminaRegeneration = staminaRegeneration; }

    public int getState() { return state; }
    public void setState(int state) { this.state = state; }

    public int getMaxState() { return maxState; }
    public void setMaxState(int maxState) { this.maxState = maxState; }

    public boolean isHandPicked() { return handPicked; }
    public void setHandPicked(boolean handPicked) { this.handPicked = handPicked; }
}
