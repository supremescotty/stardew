package ItemSystem;

/**
 * An inventory slot holds an entity, inventory slots are located in an Inventory object
 */
public class InventorySlot {
    private Entity entity; // can be any item

    public Entity getEntity() { return this.entity; }

    /**
     * Create a new InventorySlot object which contains an entity (item)
     *      and is one slot inside an Inventory of slots
     * @param e the entity in the InventorySlot (an item)
     *
     * @see Entity
     */
    public InventorySlot(Entity e) {
        this.entity = e;
    }
}
