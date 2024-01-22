package TicTacToe.models;

import TicTacToe1.models.CellState;

public class Cell {
    int row;
    int col;
    CellStatus cellStatus;
    Player player;

    public Cell(int row,int col) {
        this.row = row;
        this.col=col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public void setCellStatus(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void display() {
        if(cellStatus==CellStatus.FILLED){
            System.out.print("| "+player.getSymbol()+" |");
        }
        else{
            System.out.print("| - |");
        }
    }
}
