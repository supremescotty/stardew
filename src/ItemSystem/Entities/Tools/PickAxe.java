package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;

public class PickAxe extends Tool {
    private final static String PICK_AXE_DESCRIPTION = "";

    public PickAxe(float sellPrice, float buyPrice, int mainMaxStat) {
        this(PICK_AXE_DESCRIPTION, sellPrice, buyPrice, mainMaxStat);
    }

    public PickAxe(String description, float sellPrice, float buyPrice, int mainMaxStat) {
        super("Pick Axe", description, sellPrice, buyPrice);

        this.setMainMaxStat(mainMaxStat);
    }

    @Override
    public void execute() {

    }
}
