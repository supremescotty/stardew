package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;

public class PickAxe extends Tool {
    private final static String PICK_AXE_DESCRIPTION = "";

    public PickAxe() {
        this("PickAxe", PICK_AXE_DESCRIPTION, 3);
    }

    public PickAxe(String name, String description, int mainMaxStat) {
        super(name, description, mainMaxStat);
    }

    public PickAxe(String name, String description, float sellPrice, float buyPrice, int mainMaxStat) {
        super(name, description, sellPrice, buyPrice, mainMaxStat);
    }

    @Override
    public void execute() {

    }
}
