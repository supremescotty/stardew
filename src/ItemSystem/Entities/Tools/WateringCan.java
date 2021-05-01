package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;
//import ItemsOld.Crop;

public class WateringCan extends Tool {
    private final static String WATERING_CAN_DESCRIPTION = "";
    private int waterLevel;

    public WateringCan(float sellPrice, float buyPrice, int mainMaxStat) {
        this(WATERING_CAN_DESCRIPTION, sellPrice, buyPrice, mainMaxStat);
    }

    public WateringCan(String description, float sellPrice, float buyPrice, int mainMaxStat) {
        super("Watering Can", description, sellPrice, buyPrice);

        this.setMainMaxStat(mainMaxStat);
    }

    @Override
    public void execute() {

    }

    public int getWaterLevel() { return waterLevel; }
    public void setWaterLevel(int waterLevel) { this.waterLevel = waterLevel; }
}
