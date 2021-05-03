package CommunityCenter.Rooms;

import CommunityCenter.Bundle;

public abstract class Room {
    private boolean unlocked;
    private static String name;
    private static Bundle[] bundles;

    public Room(String name, Bundle[] bundles, boolean unlocked) {
        this.name = name;
        this.bundles = bundles;
        this.unlocked = unlocked;
    }
}
