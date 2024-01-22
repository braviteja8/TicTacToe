package TicTacToe.controllers;

import TicTacToe.exception.DuplicateSymbolException;
import TicTacToe.exception.MoreThanOneBotException;
import TicTacToe.exception.PlayersCountMismatchException;
import TicTacToe.models.Game;
import TicTacToe.models.Player;
import TicTacToe.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> playerList, List<WinningStrategy>winningStrategies) throws DuplicateSymbolException, PlayersCountMismatchException, MoreThanOneBotException {
         return Game.getBuilder()
                 .setDimension(dimension)
                 .setPlayers(playerList)
                 .setWinningStrategies(winningStrategies)
                 .build();
    }
    public void printBoard(Game game){
         game.printBoard();
    }
    public void makeMove(Game game){
        game.makeMove();
    }
}
