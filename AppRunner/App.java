package TicTacToe.AppRunner;

import TicTacToe.controllers.GameController;
import TicTacToe.exception.DuplicateSymbolException;
import TicTacToe.exception.MoreThanOneBotException;
import TicTacToe.exception.PlayersCountMismatchException;
import TicTacToe.models.*;
import TicTacToe.winningstrategies.ColWinningStrategy;
import TicTacToe.winningstrategies.DiagWinningStrategy;
import TicTacToe.winningstrategies.RowWinningStrategy;
import TicTacToe.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws DuplicateSymbolException, PlayersCountMismatchException, MoreThanOneBotException {
        GameController gameController = new GameController();
        int dimension=3;
        List<Player> playerList=new ArrayList<>();
        List<WinningStrategy>winningStrategies=new ArrayList<>();
        playerList.add(new Player('X',"ravi",1, PlayerType.HUMAN));
        playerList.add(new Bot('0',"GPT",2,PlayerType.BOT, BotDifficultyLevel.EASY));

        winningStrategies.add(new RowWinningStrategy());

        winningStrategies.add(new ColWinningStrategy());

        winningStrategies.add(new DiagWinningStrategy());
        Game game=gameController.startGame(dimension,playerList,winningStrategies);
        game.printBoard();


    }
}
