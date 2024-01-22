package TicTacToe.models;

import TicTacToe.botplayingstrategy.BotPlayingStrategy;
import TicTacToe.botplayingstrategy.BotplayingStrategyFactory;

public class Bot extends Player{
   private BotDifficultyLevel botDifficultyLevel;
   private BotPlayingStrategy botPlayingStrategy;

    public Bot(char symbol, String name, int id, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, id, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy=
                BotplayingStrategyFactory.getBpsForDifficultyLevel(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
