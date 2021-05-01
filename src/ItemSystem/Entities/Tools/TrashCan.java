package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;
import ItemSystem.Entity;
import ItemSystem.InventorySlot;

public class TrashCan extends Tool {
//    private final static String TRASH_CAN_DESCRIPTION = "";

    public TrashCan() {
        super("Trash Can", null, 0, 0);
    }

    // ! probably going to be deprecated but this is the idea for now
    public void delete(Entity e, ItemSystem.Inventory inventory) {
        for (InventorySlot slot : inventory.getInventory()) {
            if (slot != null && slot.getEntity().getId() == e.getId()) {
                slot = null;
            }
        }
    }

    @Override
    public void execute() {

    }
}
