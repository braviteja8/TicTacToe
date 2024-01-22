package TicTacToe.botplayingstrategy;

import TicTacToe.models.BotDifficultyLevel;

public class BotplayingStrategyFactory {

    public static BotPlayingStrategy getBpsForDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
       //have if else and implement on your own;
        return new EasyBotPlayingStrategy();
    }
}
