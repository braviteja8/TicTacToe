package TicTacToe.models;

import TicTacToe.exception.DuplicateSymbolException;
import TicTacToe.exception.MoreThanOneBotException;
import TicTacToe.exception.PlayersCountMismatchException;
import TicTacToe.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    List<Player> players;
    Board board;
    GameState gameState;
    Player winner;
    int nextPlayerIndex;
    List<Move>moves;
    List<WinningStrategy>winningStrategies;

    public Game(int dimension,List<WinningStrategy>winningStrategies,List<Player> players) {
        this.board=new Board(dimension);
        this.winningStrategies=winningStrategies;
        this.players = players;
    }

    public static Builder getBuilder(){
         return new Builder();
    }

    public void printBoard() {
        board.printBoard();
    }

    public void makeMove() {
        Player player=players.get(nextPlayerIndex);

    }

    public static class Builder{
         private List<Player>players;
         private List<WinningStrategy>winningStrategies;
         private int dimension;

        private Builder() {
            this.winningStrategies = new ArrayList<>();
            this.dimension=0;
            this.players=new ArrayList<>();
        }
        public Game build() throws MoreThanOneBotException, DuplicateSymbolException, PlayersCountMismatchException {
            /*
            1.validate bot count<=1;
            2.validate uniqueSymbolForPlayers
            3.validateDimensionAndPlayerCount
             */
            validateBotCount();
            validateUniqueSymbolForPlayers();
            validateDimensionsAndPlayerCount();
            return new Game(dimension,winningStrategies,players);
        }

        private void validateDimensionsAndPlayerCount() throws PlayersCountMismatchException {
            if(players.size()!=dimension-1){
                throw new PlayersCountMismatchException();
            }
        }
        private void validateUniqueSymbolForPlayers() throws DuplicateSymbolException {
            HashSet<Character>symbols=new HashSet<>();
            for(Player player:players){
                if(symbols.contains(player.getSymbol())){
                    throw new DuplicateSymbolException();
                }
                else{
                    symbols.add(player.getSymbol());
                }
            }
        }
        private void validateBotCount() throws MoreThanOneBotException {
            int botCount=0;
            for(Player player:players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }
            if(botCount>1){
                throw new MoreThanOneBotException();
            }
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
    }
}
