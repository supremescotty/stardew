package ItemSystem;

//import ItemSystem.IdList.Node;

/**
 * Base class for all items
 */
public abstract class Entity {
    private int id;
    private EntityType entityType;

    public int getId() { return id; }
    public EntityType getEntityType() { return entityType; }
}
