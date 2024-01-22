package TicTacToe.models;

public class Player {
    int id;
    String name;
    char symbol;
    PlayerType playerType;

    public Player(char symbol,String name,int id,PlayerType playerType) {
        this.symbol=symbol;
        this.name=name;
        this.id = id;
        this.playerType=playerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
