package com.gabriel.chess.pieces;

import com.gabriel.boardgame.Board;
import com.gabriel.chess.ChessPiece;
import com.gabriel.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }
}
