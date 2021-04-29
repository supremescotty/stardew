package Locations;

import Animals.Enemy.Enemy;

public class Location {
    private String locationName;
    private Enemy[] enemies;

    public String getLocationName() { return this.locationName; }
    public void setLocationName(String locationName) { this.locationName = locationName; }

    public Enemy[] getEnemies() { return this.enemies; }
    public void setEnemies(Enemy[] enemies) { this.enemies = enemies; }
}
