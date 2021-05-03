package Seasons;

import ItemSystem.Entity;

/**
 * Spring   0
 * Summer   1
 * Fall     2
 * Winter   3
 */
public class Season {
    private static final String[] seasons = new String[] {
            "Spring", "Summer", "Fall", "Winter"
    };

    private static final int daysInSeason = 28;
    private int seasonID;
    private String name;
    private Entity[] itemsInSeason;

    public static int getDaysInSeason() { return daysInSeason; }

    public int getSeasonID() { return seasonID; }
    public void setSeasonID(int seasonID) { this.seasonID = seasonID; }

    public String getSeasonName() { return name; }
    public void setSeasonName(String name) { this.name = name; }

    public Entity[] getItemsInSeason() { return itemsInSeason; }
    public void setItemsInSeason(Entity[] itemsInSeason) { this.itemsInSeason = itemsInSeason; }

    public void changeSeason() {
        // if winter, change to spring
        if (getSeasonID() == 3) {
            setSeasonID(0);
        } else {
            setSeasonID(getSeasonID() + 1);
        }
        setSeasonName(seasons[getSeasonID()]);
    }
}
