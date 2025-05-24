package Structurals.Flyweight.Chess;

public class PieceChess implements IChessPiece{
    private String color;
    private Integer row;
    private Integer column;

    public PieceChess(String color, Integer row, Integer column) {
        this.color = color;
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getColumn() {
        return column;
    }

    @Override
    public void displayi(Integer row, Integer column) {
        System.out.println("Piesa " + " de culoarea "+ this.color + " se afla la pozitia " + row + column);
    }
}
