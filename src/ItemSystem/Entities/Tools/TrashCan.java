package ItemSystem.Entities.Tools;

import ItemSystem.Entities.Tool;
import ItemSystem.Entity;
import ItemSystem.InventorySlot;

public class TrashCan extends Tool {
//    private final static String TRASH_CAN_DESCRIPTION = "";

    public TrashCan() {
        super("Trash Can", null, 0);

        this.setSellable(false);
        this.setNumberOfEntities(1);
    }

    // ! probably going to be deprecated but this is the idea for now
    public void delete(Entity e, ItemSystem.Inventory inventory) {
        for (int i = 0; i < inventory.getInventory().length; i ++) {
            if (inventory.getInventory()[i] != null && inventory.getInventory()[i].getEntity().getId() == e.getId()) {
                inventory.removeEntityFromPosition(i);
            }
        }
    }

    @Override
    public void execute() {

    }
}
