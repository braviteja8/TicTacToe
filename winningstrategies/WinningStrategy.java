package TicTacToe.winningstrategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);

}
