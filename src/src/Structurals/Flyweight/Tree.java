package Structurals.Flyweight;

public class Tree {
    private int x;
    private  int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public TreeType getType(){
        return type;
    }
}
