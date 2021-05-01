package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;

public class Scythe extends Tool {
    private final static String SCYTHE_DESCRIPTION = "";

    public Scythe(float sellPrice, float buyPrice, int mainMaxStat) {
        this(SCYTHE_DESCRIPTION, sellPrice, buyPrice, mainMaxStat);
    }

    public Scythe(String description, float sellPrice, float buyPrice, int mainMaxStat) {
        super("Scythe", description, sellPrice, buyPrice);

        this.setMainMaxStat(mainMaxStat);
    }

    @Override
    public void execute() {

    }
}
