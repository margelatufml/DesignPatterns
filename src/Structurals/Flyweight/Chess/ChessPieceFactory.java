package Chess;

import Subiect04.TipTransport;

import java.util.HashMap;
import java.util.Map;

public class ChessPieceFactory{
    private static Map<TipPiesa,ChessBoard> chessPieces=new HashMap<>();

    public static ChessBoard getChessBoard(TipPiesa tip){
        ChessBoard chessBoard=chessPieces.get(tip);

        if(chessBoard==null){
            chessBoard=new ChessBoard(tip);
            chessPieces.put(tip,chessBoard);
        }
        return chessBoard;
    }

}
