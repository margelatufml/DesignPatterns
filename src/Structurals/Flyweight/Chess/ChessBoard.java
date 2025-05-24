package Chess;

public class ChessBoard implements ShowPiece{
    private TipPiesa chessPiece;

    public ChessBoard(TipPiesa chessPiece) {
        this.chessPiece = chessPiece;
        System.out.println("S-a create piesa " + chessPiece.toString());
    }

    public TipPiesa getChessPiece() {
        return chessPiece;
    }

    @Override
    public void showPiece(PieceChess piece) {
        piece.displayi(piece.getRow(),piece.getColumn());
    }
}
