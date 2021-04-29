package Animals.Enemy;

import Animals.Animal;

public abstract class Enemy extends Animal {
    private int health;
    private int damage;
    private int criticalHitChance;

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public int getCriticalHitChance() { return criticalHitChance; }
    public void setCriticalHitChance(int criticalHitChance) { this.criticalHitChance = criticalHitChance; }
}
