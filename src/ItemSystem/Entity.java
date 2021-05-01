package ItemSystem;

//import ItemSystem.IdList.Node;

/**
 * Base class for all entities (game items)
 * <li>An entity can be stored in an InventorySlot which is stored in an Inventory</li>
 *
 * @see ItemSystem.Inventory
 * @see ItemSystem.InventorySlot
 */
public abstract class Entity {
    private int id;
    private EntityType entityType;
    private int numberOfEntities;
    private boolean stackable;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public EntityType getEntityType() { return entityType; }
    public void setEntityType(EntityType e) { this.entityType = e; }

    public int getNumberOfEntities() { return numberOfEntities; }
    public void setNumberOfEntities(int numberOfEntities) { this.numberOfEntities = numberOfEntities; }

    public boolean isStackable() { return stackable; }
    public void setStackable(boolean stackable) { this.stackable = stackable; }
}