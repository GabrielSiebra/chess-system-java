package com.gabriel.chess.pieces;

import com.gabriel.boardgame.Board;
import com.gabriel.chess.ChessPiece;
import com.gabriel.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "K";
    }
}
