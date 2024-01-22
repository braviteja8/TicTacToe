package TicTacToe.botplayingstrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Cell;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
