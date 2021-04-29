package Animals.Enemy;

import java.util.Random;

public class Slime extends Enemy {
    // starting variables
    private static final int MAX_DAMAGE = 6;
    private static final int MIN_DAMAGE = 2;
    private static final int MAX_HEALTH = 40;
    private static final int MIN_HEALTH = 32;
//    private static final int MAX_CRITICAL_HIT_CHANCE = ??
//    private static final int MIN_CRITICAL_HIT_CHANCE = ??

    private Random rand = new Random();

    public Slime() {
//        rand.nextInt(MIN_DAMAGE, MAX_DAMAGE)
    }
}
