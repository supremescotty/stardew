package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;

public class FishingRod extends Tool {
    private final static String FISHING_ROD_DESCRIPTION = "";

    public FishingRod(float sellPrice, float buyPrice, int mainMaxStat) {
        this(FISHING_ROD_DESCRIPTION, sellPrice, buyPrice, mainMaxStat);
    }

    public FishingRod(String description, float sellPrice, float buyPrice, int mainMaxStat) {
        super("Fishing Rod", description, sellPrice, buyPrice);

        this.setMainMaxStat(mainMaxStat);
    }

    @Override
    public void execute() {

    }
}
