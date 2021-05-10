package ItemSystem.JsonParser.BinaryTree;

public class Node {
    private Node left;
    private Node right;

    private int id;
    private String[] data;
    private String displayName;

    public Node(String[] data) {
        setData(data);
        setDisplayName(getData()[0]);
        setLeft(null);
        setRight(null);
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
