package ItemSystem.Entities.Weapons;

import ItemSystem.Entities.Weapon;

public class Sword extends Weapon {
    private static final String SWORD_DESCRIPTION = "";

    public Sword() {
        this("Sword", SWORD_DESCRIPTION, 0.0f, 0.0f, 4, 0.05f);
    }

    public Sword(String name) {
        this(name, SWORD_DESCRIPTION, 0.0f, 0.0f, 5, 0.08f);
    }

    public Sword(String name, int damage, float criticalHitChance) {
        this(name, SWORD_DESCRIPTION, 0.0f, 0.0f, damage, criticalHitChance);
    }

    public Sword(String name, String description, float sellPrice, float buyPrice, int damage, float criticalHitChance) {
        super(name, description, sellPrice, buyPrice, damage, criticalHitChance);
    }
}
