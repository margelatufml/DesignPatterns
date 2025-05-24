package Structurals.Flyweight;//Flyweight optimizeaza utilizarea memoriei prin partajarea datelor comune intre obiecte  similare

public class Main {
    public static void main(String[] args) {
        TreeType oakType = TreeFactory.getTreeType("Stejar", "textura_stejar");
        Tree tree1 = new Tree(10, 20, oakType);
        Tree tree2 = new Tree(30, 40, oakType);
        TreeType pineType = TreeFactory.getTreeType("Pin", "textura_pin");
        Tree tree3 = new Tree(50, 60, pineType);
    }
}