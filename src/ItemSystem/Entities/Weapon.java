package ItemSystem.Entities;

import ItemSystem.Entity;
import ItemSystem.EntityType;

public abstract class Weapon extends Entity {
    private int damage;
    private float criticalHitChance;

    /**
     * Create a new weapon
     * @param name the name of the weapon (e.g., Excalibur)
     * @param description a brief description of the weapon (e.g., The legendary sword of King Arthur)
     * @param sellPrice less than the buyPrice
     * @param buyPrice greater than the sellPrice
     */
    public Weapon(String name, String description, float sellPrice, float buyPrice, int damage, float criticalHitChance) {
        super(name, description, sellPrice, buyPrice, EntityType.WEAPON, 1);

        this.setStackable(false);
        this.setDeletable(false);
        this.setSellable(false);
    }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public float getCriticalHitChance() { return criticalHitChance; }
    public void setCriticalHitChance(float criticalHitChance) { this.criticalHitChance = criticalHitChance; }
}
