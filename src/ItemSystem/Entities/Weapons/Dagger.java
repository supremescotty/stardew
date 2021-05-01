package ItemSystem.Entities.Weapons;

import ItemSystem.Entities.Weapon;

public class Dagger extends Weapon {
    private static final String DAGGER_DESCRIPTION = "";

    public Dagger() {
        this("Dagger", DAGGER_DESCRIPTION, 0.0f, 0.0f, 4, 0.05f);
    }

    public Dagger(String name) {
        this(name, DAGGER_DESCRIPTION, 0.0f, 0.0f, 5, 0.08f);
    }

    public Dagger(String name, int damage, float criticalHitChance) {
        this(name, DAGGER_DESCRIPTION, 0.0f, 0.0f, damage, criticalHitChance);
    }

    public Dagger(String name, String description, float sellPrice, float buyPrice, int damage, float criticalHitChance) {
        super(name, description, sellPrice, buyPrice, damage, criticalHitChance);
    }
}
