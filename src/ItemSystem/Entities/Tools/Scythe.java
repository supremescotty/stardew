package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;

public class Scythe extends Tool {
    private final static String SCYTHE_DESCRIPTION = "";

    public Scythe() {
        this("Scythe", SCYTHE_DESCRIPTION, 1);
    }

    public Scythe(String name, String description, int mainMaxStat) {
        super(name, description, mainMaxStat);
    }

    public Scythe(String name, String description, float sellPrice, float buyPrice, int mainMaxStat) {
        super(name, description, sellPrice, buyPrice, mainMaxStat);
    }

    @Override
    public void execute() {

    }
}
