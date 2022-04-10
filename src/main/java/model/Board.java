package model;

public class Board {

    private Cell[][] battleField;

    public final int BOARD_SIZE = 10;

    private Cell[][] cells = new Cell[BOARD_SIZE][BOARD_SIZE];

    public Board() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                this.cells[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell[][] getBoard() {
        return cells;
    }

}
