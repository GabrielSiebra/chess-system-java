package com.gabriel.application;

import com.gabriel.boardgame.Board;
import com.gabriel.boardgame.Position;
import com.gabriel.chess.ChessMatch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());


    }
}
