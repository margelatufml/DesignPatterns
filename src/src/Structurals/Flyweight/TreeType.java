package Structurals.Flyweight;

public class TreeType {
    private String name;
    private String  texture;

    public TreeType(String name, String texture) {
        this.name = name;
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public String getTexture() {
        return texture;
    }

}
