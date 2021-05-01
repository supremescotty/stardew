package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;

public class FishingRod extends Tool {
    private final static String FISHING_ROD_DESCRIPTION = "";

    public FishingRod() {
        this("FishingRod", FISHING_ROD_DESCRIPTION, -1);
    }

    public FishingRod(String name, String description, int mainMaxStat) {
        super(name, description, mainMaxStat);
    }

    public FishingRod(String name, String description, float sellPrice, float buyPrice, int mainMaxStat) {
        super(name, description, sellPrice, buyPrice, mainMaxStat);
    }
    
//    public FishingRod() {
//        this(0, 0, -1);
//    }
//
//    public FishingRod(float sellPrice, float buyPrice, int mainMaxStat) {
//        this(FISHING_ROD_DESCRIPTION, sellPrice, buyPrice, mainMaxStat);
//    }
//
//    public FishingRod(String description, float sellPrice, float buyPrice, int mainMaxStat) {
//        super("Fishing Rod", description, sellPrice, buyPrice);
//
//        setStandardTool(mainMaxStat);
//    }

    @Override
    public void execute() {

    }
}
