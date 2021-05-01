package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;

public class Axe extends Tool {
    private final static String AXE_DESCRIPTION = "";

    public Axe(float sellPrice, float buyPrice, int mainMaxStat) {
        this(AXE_DESCRIPTION, sellPrice, buyPrice, mainMaxStat);
    }

    public Axe(String description, float sellPrice, float buyPrice, int mainMaxStat) {
        super("Axe", description, sellPrice, buyPrice);

        this.setMainMaxStat(mainMaxStat);
    }

    @Override
    public void execute() {

    }
}
