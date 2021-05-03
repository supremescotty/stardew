package CommunityCenter;

import ItemSystem.Entity;

public class Bundle {
    private static String name;
    private static Entity[] entitiesInBundle;

    public Bundle(String bundleName, Entity[] entitiesInBundle) {
        this.name = bundleName;
        this.entitiesInBundle = entitiesInBundle;
    }

    public static String getName() { return name; }
    public static Entity[] getEntitiesInBundle() { return entitiesInBundle; }
}
