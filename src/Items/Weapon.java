package Items;

public class Weapon extends Item {
    private int damage;
    private float criticalHitChance;

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public float getCriticalHitChance() { return criticalHitChance; }
    public void setCriticalHitChance(float criticalHitChance) { this.criticalHitChance = criticalHitChance; }
}
